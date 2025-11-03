package Ficha02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Opções: 1.Criar 2.Atualizar 3.Eliminar 4.Sair");

        System.out.print("Escolha a opção pretendida: ");
        int opcao= input.nextInt();

        if (opcao==1){
            System.out.println("Criar");}
        if (opcao==2){
            System.out.println("Atualizar");}
        if (opcao==3){
            System.out.println("Eliminar");}
        if (opcao<=0 || opcao>4){
            System.out.println("Opção inválida");
        }






    }
}
