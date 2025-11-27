package Ficha03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número: ");
        int numero= input.nextInt();

        for (int operacao=numero-5; operacao<numero; operacao=operacao+1){
            System.out.println(operacao+" ");}

        for (int operacao=numero+1; operacao<=numero+5; operacao=operacao+1){
            System.out.println(operacao+ " ");}}}