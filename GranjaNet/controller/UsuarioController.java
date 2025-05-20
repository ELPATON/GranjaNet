package com.suaempresa.granjapp.controller;

import com.suaempresa.granjapp.dto.UsuarioDTO;
import com.suaempresa.granjapp.facade.UsuarioFacade;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioFacade facade;

    public UsuarioController(UsuarioFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> criar(@RequestBody Map<String, String> body) {
        String nome = body.get("nome");
        String email = body.get("email");
        String senha = body.get("senha");

        UsuarioDTO dto = facade.registrarUsuario(nome, email, senha);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
}
