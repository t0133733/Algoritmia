package Ficha05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "] o valor pretendido: ");
            vetor[i] = input.nextDouble();
        }

        System.out.println("______________________________");

        double media = (vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4] + vetor[5] + vetor[6] + vetor[7] + vetor[8] + vetor[9])/10;

                System.out.println("O valor da médias dos vetores é: " + media);

    }
}
