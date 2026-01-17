package FichaExtraVetoresMatrizes;

import java.util.Scanner;

public class Ex04 {
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

        for (int i = 0; i < array.length; i++) {
            if (x==array[i]){
                System.out.println(x+" Existe no array ["+i+"]");
            }
        }
    }
}