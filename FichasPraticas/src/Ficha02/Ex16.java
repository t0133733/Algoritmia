package Ficha02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Valor: ");
        int valor= input.nextInt();
        int originalValor = valor;

        int n200 = valor / 200;
        valor = valor % 200;

        int n100 = valor / 100;
        valor = valor % 100;

        int n50 = valor / 50;
        valor = valor % 50;

        int n20 = valor / 20;
        valor = valor % 20;

        int n10 = valor / 10;
        valor = valor % 10;

        int n5 = valor / 5;
        valor = valor % 5;

        System.out.println("Valor lido: " + originalValor);
        if (n200 > 0) System.out.println(n200 + " nota(s) de 200 euros");
        if (n100 > 0) System.out.println(n100 + " nota(s) de 100 euros");
        if (n50 > 0) System.out.println(n50 + " nota(s) de 50 euros");
        if (n20 > 0) System.out.println(n20 + " nota(s) de 20 euros");
        if (n10 > 0) System.out.println(n10 + " nota(s) de 10 euros");
        if (n5 > 0) System.out.println(n5 + " nota(s) de 5 euros");
        else{
            System.out.println("ERROR");}}



}
