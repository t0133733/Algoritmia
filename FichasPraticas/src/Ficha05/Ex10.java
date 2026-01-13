package Ficha05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int linhas_matriz = matriz.length;
        int colunas_matriz = matriz[0].length;

        for (int i = 0; i < linhas_matriz; i++) {
            for (int x = 0; x < colunas_matriz; x++) {
                System.out.print("Introduza na linha[" + i + "] e na coluna [" + x + "] os valores pretendidos: ");
                matriz[i][x] = input.nextInt();
            }
        }

        System.out.println("______________________");

        System.out.print("Insira um número para pesquisar: ");
        int y = input.nextInt();

        int contador = 0;

        for (int i = 0; i < linhas_matriz; i++) {
            for (int x = 0; x < colunas_matriz; x++) {
                if (y == matriz[i][x]) {
                    contador++;
                }
            }
        }

        System.out.println("Há " + contador + " posições na matriz com o número " + y);

    }
}
