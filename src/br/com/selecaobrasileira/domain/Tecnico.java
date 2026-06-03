package br.com.selecaobrasileira.domain;

import java.time.LocalDate;

public class Tecnico {
    private String nome;
    private String nacionalidade;
    private LocalDate dataInicioMandato;

    public Tecnico(String nome, String nacionalidade, LocalDate dataInicioMandato) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataInicioMandato = dataInicioMandato;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public LocalDate getDataInicioMandato() {
        return dataInicioMandato;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", dataInicioMandato=" + dataInicioMandato +
                '}';
    }
}
