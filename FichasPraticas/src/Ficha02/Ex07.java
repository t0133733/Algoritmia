package Ficha02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número: ");
        int numero=input.nextInt();

        int metade = numero / 2;
        int reconstruido = metade * 2;

        if (reconstruido == numero) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");}}




}
