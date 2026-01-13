package Ficha05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; x++) {
                System.out.print("Introduza na linha[" + i + "] e na coluna [" + x + "] os valores pretendidos: ");
                matriz[i][x] = input.nextInt();
            }
        }


        System.out.println("_______________________");


        int diagonal = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3];


        System.out.println("A soma dos elementos da diagonal principal é: " + diagonal);


    }
}
