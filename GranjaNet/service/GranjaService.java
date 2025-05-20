package com.suaempresa.granjapp.service;

import com.suaempresa.granjapp.entities.Granja;
import com.suaempresa.granjapp.repository.GranjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GranjaService {
    private final GranjaRepository repository;

    public GranjaService(GranjaRepository repository) {
        this.repository = repository;
    }

    public Granja salvar(Granja granja) {
        return repository.save(granja);
    }

    public List<Granja> buscarPorUsuario(Long usuarioId) {
        return repository.findByUsuarioId(usuarioId);
    }
}
