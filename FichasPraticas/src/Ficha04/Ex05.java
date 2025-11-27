package Ficha04;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.print("1.Criar 2.Atualizar 3.Eliminar 4.Sair: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Criar");
                    break;
                case 2:
                    System.out.println("Atualizar");
                    break;
                case 3:
                    System.out.println("Eliminar");
                    break;
                case 4:
                    break;
            }

        } while (opcao != 4);

    }
}


