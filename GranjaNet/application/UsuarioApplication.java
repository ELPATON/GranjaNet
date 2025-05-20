package com.suaempresa.granjapp.application;

import com.suaempresa.granjapp.dto.UsuarioDTO;
import com.suaempresa.granjapp.entities.Usuario;
import com.suaempresa.granjapp.service.UsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioApplication {
    private final UsuarioService service;

    public UsuarioApplication(UsuarioService service) {
        this.service = service;
    }

    public UsuarioDTO cadastrar(String nome, String email, String senha) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha); // Ideal usar criptografia

        Usuario salvo = service.cadastrar(usuario);
        return new UsuarioDTO(salvo.getId(), salvo.getNome(), salvo.getEmail());
    }
}
