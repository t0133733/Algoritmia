package Ficha05;

import java.util.Scanner;

public class Ex08 {
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
    }
}
