package Ficha04;

import java.util.Scanner;

public class Ex04 {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String decisao;

    do {
        System.out.print("Insira um número: ");
        int num = input.nextInt();
        System.out.print("Insira um número: ");
        int num2 = input.nextInt();
        System.out.print("Insira uma operação (+,-,*,/): ");
        String operacao = input.next();

        switch (operacao) {
            case "+":
                System.out.println(num + num2);
                break;
            case "-":
                System.out.println(num - num2);
                break;
            case "*":
                System.out.println(num * num2);
                break;
            case "/":
                System.out.println(num / num2);
                break;
        }
        System.out.println("Deseja continuar? (s/n): ");
        decisao = input.next();

    } while (decisao.equalsIgnoreCase("s"));
}
}


