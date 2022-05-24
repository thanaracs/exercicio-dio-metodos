package br.com.dio;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int opcao = 1;
        int continuar;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; opcao != 0; i++) {
            System.out.println("\n" +
                    "1 - soma \n" +
                    "2 - subtracao  \n" +
                    "3 - multiplicacao \n" +
                    "4 - divisao  \n" +
                    "Informe sua opcao: ");
            opcao = ler.nextInt();
            if (opcao > 0  && opcao < 5) {
                if (opcao == 1) {
                    soma();
                }
                if (opcao == 2) {
                    subtracao();
                }
                if (opcao == 3) {
                    multiplicacao();
                }
                if (opcao == 4) {
                    divisao();
                }
                System.out.println("\n Deseja continuar? (1-SIM ou 2-NAO)");
                continuar = ler.nextInt();
                if(continuar == 1 || continuar ==2){
                    if(continuar == 2){
                        System.out.println("O PROGRAMA FOI FINALIZADO!");
                        opcao = 0;
                    }
                }

            }
        }
    }


    public static int valorUm() {
        int valorUm;
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o primeiro valor:");
        valorUm = ler.nextInt();

        return valorUm;
    }

    public static int valorDois() {
        int valorDois;
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o segundo valor: ");
        valorDois = ler.nextInt();

        return valorDois;
    }

    private static void soma() {
        int valorUm = valorUm();
        int valorDois = valorDois();
        System.out.println("\n A soma dos valores : " + (valorUm + valorDois) );

    }

    private static void subtracao() {
        int valorUm = valorUm();
        int valorDois = valorDois();
        System.out.println("A subtracao dos valores : " + (valorUm - valorDois));
    }

    private static void multiplicacao() {
        int multiplicacao;
        int valorUm = valorUm();
        int valorDois = valorDois();
        multiplicacao = valorUm * valorDois;
        System.out.println("\n A soma dos valores : " + multiplicacao);
    }

    private static void divisao() {
        int divisao;
        int valorUm = valorUm();
        int valorDois = valorDois();
        divisao = valorUm/valorDois;
        System.out.println("A soma dos valores : " + divisao);
    }
}
