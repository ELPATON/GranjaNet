package com.suaempresa.granjapp.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Granja> granjas = new ArrayList<>();
    // Getters e setters
}
