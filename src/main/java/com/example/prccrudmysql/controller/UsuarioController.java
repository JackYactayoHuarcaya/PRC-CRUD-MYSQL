package com.example.prccrudmysql.controller;

import com.example.prccrudmysql.application.CreateUsuario;
import com.example.prccrudmysql.application.DeleteUsuario;
import com.example.prccrudmysql.domain.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final CreateUsuario createUsuario;
    private final DeleteUsuario deleteUsuario;
    public UsuarioController(CreateUsuario createUsuario,DeleteUsuario deleteUsuario){
        this.createUsuario=createUsuario;
        this.deleteUsuario=deleteUsuario;
    }
    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return this.createUsuario.execute(usuario);
    }
    @DeleteMapping("/{id}")
    public  void create(@PathVariable Long id){
        this.deleteUsuario.execute(id);
    }
}
