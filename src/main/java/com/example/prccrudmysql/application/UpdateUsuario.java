package com.example.prccrudmysql.application;

import com.example.prccrudmysql.domain.Usuario;
import com.example.prccrudmysql.infrastructure.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UpdateUsuario {
    private final UsuarioRepository usuarioRepository;
    public UpdateUsuario(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }
    public void execute(Long id, Usuario usuario){
        Usuario userFind = this.usuarioRepository.findById(id).orElseThrow();
        userFind.setEdad(usuario.getEdad());
        userFind.setNombre(usuario.getNombre());
        this.usuarioRepository.save(userFind);
    }
}
