package Ficha02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2;
        System.out.print("Introduza um número: ");
        numero1= input.nextInt();

        System.out.print("Introduza outro número: ");
        numero2= input.nextInt();

        if (numero1>numero2) {

        System.out.println(numero2+" "+ numero1);}


        if (numero2>numero1) {

            System.out.println(numero1+" "+ numero2);}}



}
