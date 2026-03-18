package com.example.prccrudmysql.application;

import com.example.prccrudmysql.domain.Usuario;
import com.example.prccrudmysql.infrastructure.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUsuario {
    UsuarioRepository usuarioRepository;
    public CreateUsuario(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    public Usuario execute(Usuario usuario){
        this.usuarioRepository.save(usuario);
        return  usuario;
    }
}
