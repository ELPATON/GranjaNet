package com.devlayers.spring_granja_net.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "registro_mortalidade")
public class RegistroMortalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lote_id", nullable = false)
    private Lote lote;


    @Column(name = "data_ocorrencia", nullable = false)
    private LocalDateTime dataOcorrencia;

    @Column(name = "quantidade", nullable = false)
    private int quantidade;

    @Column(name = "causa")
    private String causa;

    @Column(name = "observacoes")
    private String observacoes;

    public RegistroMortalidade(Lote lote, LocalDateTime dataOcorrencia, int quantidade, String causa, String observacoes) {
        this.lote = lote;
        this.dataOcorrencia = dataOcorrencia;
        this.quantidade = quantidade;
        this.causa = causa;
        this.observacoes = observacoes;
    }


    public RegistroMortalidade() {
    }


    public Long getId() {
        return id;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }


    public LocalDateTime getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(LocalDateTime dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "RegistroMortalidade{" +
                "id=" + id +
                ", loteId=" + (lote != null ? lote.getId() : null) +
               // ", galpaoId=" + (galpao != null ? galpao.getId() : null) +
                ", dataOcorrencia=" + dataOcorrencia +
                ", quantidade=" + quantidade +
                ", causa='" + causa + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
