package Ficha05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int y=0;

        for (int i = 0; i < 5; i++) {
            for (int x = 0; x < 5; x++) {
                System.out.print("Introduza na linha[" + i + "] e na coluna [" + x + "] os valores pretendidos: ");
                matriz[i][x] = input.nextInt();
                y+=matriz[i][x];
            }
        }


        System.out.println("______________________");


        System.out.println("A soma de todos os elementos da matriz é: "+y);
    }
}
