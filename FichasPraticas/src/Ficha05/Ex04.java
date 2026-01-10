package Ficha05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "] o valor pretendido: ");
            vetor[i] = input.nextInt();
        }


        if (vetor[0] < vetor[1] && vetor[0] < vetor[2] && vetor[0] < vetor[3] && vetor[0] < vetor[4] && vetor[0] < vetor[5] && vetor[0] < vetor[6] && vetor[0] < vetor[7] && vetor[0] < vetor[8] && vetor[0] < vetor[9]) {
            System.out.println("O menor número é do vetor[0]: " + vetor[0]);
        }
        if (vetor[1] < vetor[0] && vetor[1] < vetor[2] && vetor[1] < vetor[3] && vetor[1] < vetor[4] && vetor[1] < vetor[5] && vetor[1] < vetor[6] && vetor[1] < vetor[7] && vetor[1] < vetor[8] && vetor[1] < vetor[9]) {
            System.out.println("O menor número é do vetor[1]: " + vetor[1]);
        }
        if (vetor[2] < vetor[0] && vetor[2] < vetor[1] && vetor[2] < vetor[3] && vetor[2] < vetor[4] && vetor[2] < vetor[5] && vetor[2] < vetor[6] && vetor[2] < vetor[7] && vetor[2] < vetor[8] && vetor[2] < vetor[9]) {
            System.out.println("O menor número é do vetor[2]: " + vetor[2]);
        }
        if (vetor[3] < vetor[0] && vetor[3] < vetor[1] && vetor[3] < vetor[2] && vetor[3] < vetor[4] && vetor[3] < vetor[5] && vetor[3] < vetor[6] && vetor[3] < vetor[7] && vetor[3] < vetor[8] && vetor[3] < vetor[9]) {
            System.out.println("O menor número é do vetor[3]: " + vetor[3]);
        }
        if (vetor[4] < vetor[0] && vetor[4] < vetor[1] && vetor[4] < vetor[2] && vetor[4] < vetor[3] && vetor[4] < vetor[5] && vetor[4] < vetor[6] && vetor[4] < vetor[7] && vetor[4] < vetor[8] && vetor[4] < vetor[9]) {
            System.out.println("O menor número é do vetor[4]: " + vetor[4]);
        }
        if (vetor[5] < vetor[0] && vetor[5] < vetor[1] && vetor[5] < vetor[2] && vetor[5] < vetor[3] && vetor[5] < vetor[4] && vetor[5] < vetor[6] && vetor[5] < vetor[7] && vetor[5] < vetor[8] && vetor[5] < vetor[9]) {
            System.out.println("O menor número é do vetor[5]: " + vetor[5]);
        }
        if (vetor[6] < vetor[0] && vetor[6] < vetor[1] && vetor[6] < vetor[2] && vetor[6] < vetor[3] && vetor[6] < vetor[4] && vetor[6] < vetor[5] && vetor[6] < vetor[7] && vetor[6] < vetor[8] && vetor[6] < vetor[9]) {
            System.out.println("O menor número é do vetor[6]: " + vetor[6]);
        }
        if (vetor[7] < vetor[0] && vetor[7] < vetor[1] && vetor[7] < vetor[3] && vetor[7] < vetor[4] && vetor[7] < vetor[5] && vetor[7] < vetor[6] && vetor[7] < vetor[2] && vetor[7] < vetor[8] && vetor[7] < vetor[9]) {
            System.out.println("O menor número é do vetor[7]: " + vetor[7]);
        }
        if (vetor[8] < vetor[0] && vetor[8] < vetor[1] && vetor[8] < vetor[3] && vetor[8] < vetor[4] && vetor[8] < vetor[5] && vetor[8] < vetor[6] && vetor[8] < vetor[7] && vetor[8] < vetor[9] && vetor[8] < vetor[2]) {
            System.out.println("O menor número é do vetor[8]: " + vetor[8]);
        }
        if (vetor[9] < vetor[0] && vetor[9] < vetor[1] && vetor[9] < vetor[3] && vetor[9] < vetor[4] && vetor[9] < vetor[5] && vetor[9] < vetor[6] && vetor[9] < vetor[7] && vetor[9] < vetor[8] && vetor[9] < vetor[2]) {
            System.out.println("O menor número é do vetor[9]: " + vetor[9]);
        }
    }
}
