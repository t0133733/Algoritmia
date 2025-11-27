package Ficha03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int soma = 0;
        int quantidade = 0;

        System.out.print("Digite números um a um (use -1 para terminar):");
        num = input.nextInt();

        while (num != -1) {
            soma = soma + num;
            quantidade = quantidade + 1;
            num = input.nextInt();
        }

        if (quantidade > 0) {
            double media = soma / (double) quantidade;
            System.out.println("Média dos números: " + media);
        } else {
            System.out.println("Nenhum número foi introduzido.");
        }
    }
}