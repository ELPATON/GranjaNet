package com.suaempresa.granjapp.facade;

import com.suaempresa.granjapp.application.UsuarioApplication;
import com.suaempresa.granjapp.dto.UsuarioDTO;
import org.springframework.stereotype.Component;

@Component
public class UsuarioFacade {
    private final UsuarioApplication application;

    public UsuarioFacade(UsuarioApplication application) {
        this.application = application;
    }

    public UsuarioDTO registrarUsuario(String nome, String email, String senha) {
        return application.cadastrar(nome, email, senha);
    }
}
