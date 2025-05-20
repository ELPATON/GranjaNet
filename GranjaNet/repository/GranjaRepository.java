package com.suaempresa.granjapp.repository;

import com.suaempresa.granjapp.entities.Granja;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GranjaRepository extends JpaRepository<Granja, Long> {
    List<Granja> findByUsuarioId(Long usuarioId);
}
