package FichaExtraVetoresMatrizes;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira no vetor["+i+"] o valor pretendido: ");
            array[i]= input.nextInt();
        }


        System.out.println("____________________");

        for (int i = 9; i >= 0; i--) {
            System.out.println("Vetor ["+i+"] = "+array[i]);
        }


    }
}
