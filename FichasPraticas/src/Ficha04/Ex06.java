package Ficha04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tentativas = 0;

        System.out.print("Insira um número entre 0-100 (Jogador 1): ");
        int jogador1 = input.nextInt();
        System.out.print("Jogador 2: ");
        int jogador2 = input.nextInt();
        tentativas++;

        while (jogador1 != jogador2) {
            if (jogador2 > jogador1) {
                System.out.println("Superior");
            } else {
                System.out.println("Inferior");
            }
            System.out.print("Jogador 2: ");
            jogador2 = input.nextInt();
            tentativas++;

        }
        System.out.println("Certo! Número de tentativas: " + tentativas);
    }
}

