package br.com.selecaobrasileira.application;

import br.com.selecaobrasileira.domain.Jogador;
import br.com.selecaobrasileira.domain.Posicao;
import br.com.selecaobrasileira.domain.Tecnico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Jogador> jogadoresCadastrados = new ArrayList<>();
    static Tecnico tecnicoAtual;
    public static void main(String[] args) {
        byte opc = menuPrincipal();
        while (opc != 4){
            switch (opc){
                case 1:
                    cadastrarJogador();
                    break;
                case 2:
                    cadastrarTecnico();
                    break;
                case 3:

                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            opc = menuPrincipal();
        }
    }

    public static byte menuPrincipal(){
        System.out.println("+---------- MENU ----------+");
        System.out.println("| 1 - CADASTRAR JOGADORES  |");
        System.out.println("| 2 - CRIAR TÉCNICO        |");
        System.out.println("| 3 - CRIAR CONVOCAÇÃO     |");
        System.out.println("| 4 - SAIR                 |");
        System.out.println("+--------------------------+");
        System.out.println("\nSelecione uma das opções: ");
        byte opc = input.nextByte();

        return opc;
    }

    public static void cadastrarJogador(){
        System.out.println("+--- CADASTRAR JOGADORES ---+");

        System.out.println("Digite o nome do jogador: ");
        String nome = input.nextLine().toUpperCase();

        System.out.println("Digite o ano de nascimento: ");
        int ano = Integer.parseInt(input.nextLine());

        System.out.println("Digite o mês (1 - 12): ");
        int mes = Integer.parseInt(input.nextLine());

        System.out.println("Digite o dia: ");
        int dia = Integer.parseInt(input.nextLine());

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        System.out.println("Digite o nome do clube do jogador: ");
        String clube = input.nextLine().toUpperCase();

        System.out.println("Digite o número da camisa: ");
        int numCamisa = Integer.parseInt(input.nextLine());

        System.out.println("Posições disponíveis:");
        for (int i = 0; i < Posicao.values().length; i++) {
            System.out.println(i + 1 +" - " + Posicao.values()[i]);
        }
        System.out.print("Selecione a posição: ");
        int opcPosicao = Integer.parseInt(input.nextLine()) - 1;
        Posicao posicao = Posicao.values()[opcPosicao];

        Jogador jogador = new Jogador(nome, dataNascimento, clube, numCamisa, posicao);

        if(jogadoresCadastrados.add(jogador)){
            System.out.println("Jogador cadastrado com sucesso!");
        } else {
            System.out.println("Aconteceu um erro ao cadastrar jogador.");
        }
    }

    public static void cadastrarTecnico(){
        if(tecnicoAtual != null){
            System.out.println("Já existe um técnico cadastrado, tem certeza que deseja mudar? (S/N)");
            char opc = Character.toUpperCase(input.next().charAt(0));

            if(opc == 'N'){
                return;
            } else if(opc != 'S'){
                System.out.println("Opção inválida!");
                return;
            }
        }

        System.out.println("+--- CADASTRAR TÉCNICO ---+");
        System.out.println("Digite o nome do técnico: ");
        String nome = input.nextLine().toUpperCase();

        System.out.println("Digite a nacionalidade do técnico: ");
        String nacionalidade = input.nextLine();

        System.out.println("Digite o ano do inicio do mandato: ");
        int ano = Integer.parseInt(input.nextLine());

        System.out.println("Digite o mês (1 - 12): ");
        int mes = Integer.parseInt(input.nextLine());

        System.out.println("Digite o dia: ");
        int dia = Integer.parseInt(input.nextLine());

        LocalDate dataInicioMandato = LocalDate.of(ano, mes, dia);

        tecnicoAtual = new Tecnico(nome, nacionalidade, dataInicioMandato);
        System.out.println("Técnico criado com sucesso!");
    }
}
