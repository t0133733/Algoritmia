package Ficha01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numero1, numero2, soma, subtracao, multiplicacao, divisao;

        System.out.print("Insira um número: ");

                numero1 = input.nextDouble();

                System.out.print("Insira outro número: ");

                numero2 = input.nextDouble();

                soma = numero1 + numero2;
                subtracao = numero1 - numero2;
                multiplicacao = numero1 * numero2;
                divisao = numero1 / numero2;

                System.out.println("Soma:" + soma);
                System.out.println("Subtração:" + subtracao);
                System.out.println("Multiplicação:" + multiplicacao);
                System.out.println("Divisão:" + divisao);}

    }