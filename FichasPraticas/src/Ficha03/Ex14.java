package Ficha03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int limite=1;

        System.out.print("Quantos números deseja inserir: ");
        int quantidade= input.nextInt();
        System.out.print("Introduza um número: ");
        int numeroAnterior= input.nextInt();

        boolean crescente=true;
        while (limite<quantidade){
            System.out.print("Introduza um número: ");
            int numeroAtual= input.nextInt();
            if (numeroAtual <= numeroAnterior){
        crescente=false;}

            numeroAnterior=numeroAtual;

            limite=limite+1;}
        if (crescente){
            System.out.println("Crescente");
        }
        else {
            System.out.println("Decrescente");
    }}}