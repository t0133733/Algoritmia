package Ficha05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                System.out.print("Introduza na linha[" + i + "] e na coluna [" + x + "] os valores pretendidos: ");
                matriz[i][x] = input.nextInt();
            }
        }

        System.out.println("_________________________");


        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(matriz[i][x] + " ");
            }
            System.out.println();
        }

        System.out.println("_________________________");

        int y = matriz[0][0];
        int z = matriz[0][0];


        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                if (matriz[i][x] > y) {
                    y = matriz[i][x];

                }
                if (matriz[i][x] < z) {
                    z = matriz[i][x];
                }


            }
        }

        System.out.println("O maior elemento da matriz é: " + y);
        System.out.println("O menor elemento da matriz é: " + z);

    }
}


