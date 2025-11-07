package Ficha03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero1 = input.nextInt();

        System.out.print("Insira um número: ");
        int numero2 = input.nextInt();

        while (numero1 <= numero2) {
            System.out.println(numero1);
            numero1 = numero1 + 1;
        }}}
