package Ficha06;

import java.util.Scanner;

import static Ficha06.Ex06.*;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.print("Análise de um número: ");
            int num = input.nextInt();
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de número");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: {
                    parOuImpar(num);
                    break;
                }
                case 2: {
                    positivoOuNegativo(num);
                    break;
                }
                case 3: {
                    primo(num);
                    break;
                }
                case 4: {
                    perfeito(num);
                    break;
                }
                case 5: {
                    triangular(num);
                    break;
                }
                case 6: {
                    break;
                }
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        System.out.println("Volte sempre!");
    }
}