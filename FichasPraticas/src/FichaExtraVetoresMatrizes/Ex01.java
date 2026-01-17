package FichaExtraVetoresMatrizes;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[14];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira no vetor[" + i + "] o número pretendido: ");
            array[i] = input.nextInt();
        }

        System.out.println("________________________");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Vetor [" + i + "] = " + array[i]);
        }

    }
}