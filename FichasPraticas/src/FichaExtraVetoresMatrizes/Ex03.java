package FichaExtraVetoresMatrizes;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira no vetor[" + i + "] o valor pretendido: ");
            array[i] = input.nextInt();
        }

        System.out.println("____________________");

        System.out.print("Escolha um número para pesquisar: ");
        int x = input.nextInt();

        boolean y = false;

        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                y = true;
            }
        }

        if (y) {
            System.out.println(x + " Existe no array");
        } else {
            System.out.println(x + " Não existe no array");
        }

    }
}
