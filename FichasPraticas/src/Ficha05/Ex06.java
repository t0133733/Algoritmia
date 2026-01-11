package Ficha05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira no vetor [" + i + "] o valor pretendido: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("____________________________");

        boolean y = true;

        for (int i = 1; i < 10; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                y = false;
                break;
            }
        }
        if (y) {
            System.out.println("Os valores estão em ordem crescente");
        } else {
            System.out.println("Os valores não estão em ordem crescente");
        }
    }
}
