package com.example.prccrudmysql.application;

import com.example.prccrudmysql.domain.Usuario;
import com.example.prccrudmysql.infrastructure.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteUsuario {
    private final UsuarioRepository usuarioRepository;
    public DeleteUsuario(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }
    public void execute(Long id){
        this.usuarioRepository.deleteById(id);
    }
}
