package Ficha05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[12];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "] a comissão mensal: ");
            vetor[i] = input.nextDouble();
        }

        System.out.println("__________________________");


        double total=0;

        for (int i = 0; i < vetor.length; i++) {
            total+=vetor[i];
        }

        System.out.println("Total de comissões: " + total);

    }
}
