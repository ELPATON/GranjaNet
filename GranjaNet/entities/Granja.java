package com.suaempresa.granjapp.entities;

import jakarta.persistence.*;

@Entity
public class Granja {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String localizacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    // Getters e setters
}
