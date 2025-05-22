package com.devlayers.spring_granja_net.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import java.time.LocalDate;

@Entity
@Table(name = "lote")
public class Lote {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "tempo_vida")
    private int tempoVida;

    @Column(name = "historico_galpoes")
    private String historicoGalpoes;

    public Lote() {
    }

    public Lote(Long id, LocalDate dataNascimento, int tempoVida, String historicoGalpoes) {
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.tempoVida = tempoVida;
        this.historicoGalpoes = historicoGalpoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getTempoVida() {
        return tempoVida;
    }

    public void setTempoVida(int tempoVida) {
        this.tempoVida = tempoVida;
    }

    public String getHistoricoGalpoes() {
        return historicoGalpoes;
    }

    public void setHistoricoGalpoes(String historicoGalpoes) {
        this.historicoGalpoes = historicoGalpoes;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "id=" + id +
                ", dataNascimento=" + dataNascimento +
                ", tempoVida=" + tempoVida +
                ", historicoGalpoes='" + historicoGalpoes + '\'' +
                '}';
    }
}
