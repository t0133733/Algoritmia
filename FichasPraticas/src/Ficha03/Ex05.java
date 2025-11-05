package Ficha03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número: ");
        int numero= input.nextInt();
        System.out.print("Introduza uma mensagem: ");
        String mensagem= input.next();

        for (int operacao=0; operacao<numero; operacao=operacao+1){
            System.out.println(mensagem);
        }


    }
}
