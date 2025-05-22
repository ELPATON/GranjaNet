package com.devlayers.spring_granja_net.repositories;

import com.devlayers.spring_granja_net.entities.RegistroMortalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devlayers.spring_granja_net.entities.Lote;

import java.util.List;

@Repository
public class RegistroMortalidadeRepository{

    private RegistroMortalidade registroMortalidade;

    public RegistroMortalidadeRepository(RegistroMortalidade registroMortalidade) {
        this.registroMortalidade = registroMortalidade;
    }

    public Long createRegistroMortalidade(RegistroMortalidade registroMortalidade) {
        RegistroMortalidade savedRegistroMortalidade = registroMortalidade.save(registroMortalidade);
        return savedRegistroMortalidade.getId();
    }

    public List<Lote> listRegistroMortalidade() {
        return registroMortalidade.findAll();
    }


}
