package com.suaempresa.granjapp.service;

import com.suaempresa.granjapp.entities.Usuario;
import com.suaempresa.granjapp.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario cadastrar(Usuario usuario) {
        return repository.save(usuario);
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return repository.findById(id);
    }
}
