package Ficha06;

import java.util.Scanner;

import static Ficha06.Ex08.*;


public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Número de valores da lista: ");
        int lista = input.nextInt();

        int[] vetor = new int[lista];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor [" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int opcao;
        do {

            System.out.println("1. Maior elemento");
            System.out.println("2. Menor elemento");
            System.out.println("3. Crescente ou não crescente");
            System.out.println("4. Trocar a lista");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: {
                    maiorElemento(vetor);
                    break;
                }
                case 2: {
                    menorElemento(vetor);
                    break;
                }
                case 3: {
                    crescente(vetor);
                    break;
                }
                case 4: {

                    break;
                }

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
        System.out.println("Volte sempre!");
    }
}
