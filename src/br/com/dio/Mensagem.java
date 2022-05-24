package br.com.dio;

import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args ) {
        int hora;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a hora: ");
        hora = ler.nextInt();

       if(hora > 0 && hora <12){
           bomdia();
       }
        if(hora > 11 && hora <18){
            boatarde();
        }
        if(hora > 17  && hora <24){
            boanoite();
        }
        if(hora < 0 || hora > 24){
            System.out.println("Informe um horario valido!");
        }
    }

    private static void bomdia() {
        System.out.println("Bom dia!");
    }

    private static void boatarde() {
        System.out.println("Boa tarde!");
    }

    private static void boanoite() {
        System.out.println("Boa noite!");
    }

}
