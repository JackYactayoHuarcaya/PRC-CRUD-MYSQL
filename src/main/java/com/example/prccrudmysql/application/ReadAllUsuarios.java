package com.example.prccrudmysql.application;

import com.example.prccrudmysql.domain.Usuario;
import com.example.prccrudmysql.infrastructure.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadAllUsuarios {
    private final UsuarioRepository usuarioRepository;
    public ReadAllUsuarios(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    public List<Usuario> execute(){
        return  this.usuarioRepository.findAll();
    }
}
