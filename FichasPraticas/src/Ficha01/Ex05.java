package Ficha01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numero1, numero2, numero3, mediaaritmetica, mediaponderada, pesonumero1, pesonumero2, pesonumero3;

        System.out.print("Insira um número: ");

        numero1 = input.nextDouble();

        System.out.print("Insira outro número: ");

        numero2 = input.nextDouble();

        System.out.print("Insira outro número: ");

        numero3 = input.nextDouble();

        mediaaritmetica = (numero1 + numero2 + numero3) / 3;

        System.out.print("Insira o peso do número 1: ");

        pesonumero1 = input.nextDouble();

        System.out.print("Insira o peso do número 2: ");

        pesonumero2 = input.nextDouble();

        System.out.print("Insira o peso do número 3: ");

        pesonumero3 = input.nextDouble();

        mediaponderada = ( (numero1 * pesonumero1) + (numero2 * pesonumero2) + (numero3 * pesonumero3) ) / (pesonumero1 + pesonumero2 + pesonumero3);

        System.out.println("Média aritmética: " + mediaaritmetica);
        System.out.println("Média ponderada: " + mediaponderada);
    }


    }