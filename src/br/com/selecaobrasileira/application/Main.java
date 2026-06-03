package br.com.selecaobrasileira.application;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        byte opc = menuPrincipal();
        while (opc != 4){
            switch (opc){
                case 1:
                    break;
                case 2:
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
}
