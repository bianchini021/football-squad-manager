package br.com.selecaobrasileira.domain;

import java.time.LocalDate;
import java.time.Period;

public class Jogador {
    private int Id;
    private String nome;
    private LocalDate dataNascimento;
    private String clube;
    private int numCamisa;
    private Posicao posicao;
    private boolean convocado;

    public Jogador(int id, String nome, LocalDate dataNascimento, String clube, int numCamisa, Posicao posicao, boolean convocado) {
        Id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.clube = clube;
        this.numCamisa = numCamisa;
        this.posicao = posicao;
        this.convocado = convocado;
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getClube() {
        return clube;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public boolean isConvocado() {
        return convocado;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public void setConvocado(boolean convocado) {
        this.convocado = convocado;
    }

    public int calcularIdade(){
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);

        return periodo.getYears();
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", clube='" + clube + '\'' +
                ", numCamisa=" + numCamisa +
                ", posicao=" + posicao +
                ", convocado=" + convocado +
                '}';
    }
}
