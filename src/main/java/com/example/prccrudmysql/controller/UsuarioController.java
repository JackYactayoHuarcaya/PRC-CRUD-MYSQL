package com.example.prccrudmysql.controller;

import com.example.prccrudmysql.application.CreateUsuario;
import com.example.prccrudmysql.domain.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final CreateUsuario createUsuario;
    public UsuarioController(CreateUsuario createUsuario){
        this.createUsuario=createUsuario;
    }
    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return this.createUsuario.execute(usuario);
    }
}
