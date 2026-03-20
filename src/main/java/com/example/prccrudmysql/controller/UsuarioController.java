package com.example.prccrudmysql.controller;

import com.example.prccrudmysql.application.CreateUsuario;
import com.example.prccrudmysql.application.DeleteUsuario;
import com.example.prccrudmysql.application.ReadAllUsuarios;
import com.example.prccrudmysql.application.UpdateUsuario;
import com.example.prccrudmysql.domain.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final CreateUsuario createUsuario;
    private final DeleteUsuario deleteUsuario;
    private final ReadAllUsuarios readAllUsuarios;
    private final UpdateUsuario updateUsuario;
    public UsuarioController(CreateUsuario createUsuario,
                             ReadAllUsuarios readAllUsuarios,
                             UpdateUsuario updateUsuario,
                             DeleteUsuario deleteUsuario){
        this.createUsuario=createUsuario;
        this.deleteUsuario=deleteUsuario;
        this.readAllUsuarios =readAllUsuarios;
        this.updateUsuario= updateUsuario;
    }
    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return this.createUsuario.execute(usuario);
    }
    @DeleteMapping("/{id}")
    public  void create(@PathVariable Long id){
        this.deleteUsuario.execute(id);
    }
    @GetMapping
    public List<Usuario> readAll(){
      return this.readAllUsuarios.execute();
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Long id,@RequestBody Usuario usuario){
        this.updateUsuario.execute(id,usuario);
    }
}
