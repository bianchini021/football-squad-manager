package br.com.selecaobrasileira.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Convocacao {
    private int id;
    private String competicao;
    private LocalDate dataConvocacao;
    private Tecnico tecnico;
    private ArrayList<Jogador> jogadores;

    public Convocacao(String competicao, LocalDate dataConvocacao, Tecnico tecnico) {
        this.competicao = competicao;
        this.dataConvocacao = dataConvocacao;
        this.tecnico = tecnico;
    }

    public int getId() {
        return id;
    }

    public String getCompeticao() {
        return competicao;
    }

    public LocalDate getDataConvocacao() {
        return dataConvocacao;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public boolean adicionarJogador(Jogador jogador){
        if(jogadores.size() < 26){
            return jogadores.add(jogador);
        }
        return false;
    }

    public boolean removerJogador(Jogador jogador){
        return jogadores.remove(jogador);
    }

    public void buscarPorPosicao(Posicao posicao){
        for(Jogador j : jogadores){
            if(j.getPosicao().equals(posicao)){
                System.out.println("Jogador:" +j.getNome());
            }
        }
    }

    @Override
    public String toString() {
        return "Convocacao{" +
                "id=" + id +
                ", competicao='" + competicao + '\'' +
                ", dataConvocacao=" + dataConvocacao +
                ", tecnico=" + tecnico +
                ", jogadores=" + jogadores +
                '}';
    }
}
