package Ficha02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2, numero3;
        System.out.print("Introduza um número: ");
        numero1=input.nextInt();

        System.out.print("Introduza um número: ");
        numero2=input.nextInt();

        System.out.print("Introduza um número: ");
        numero3= input.nextInt();

        if (numero1<numero2 && numero1<numero3) {

            System.out.println("" + numero1);}

        if (numero2<numero1 && numero2<numero3) {

            System.out.println("" + numero2);}

        if (numero3<numero1 && numero3<numero2) {
            System.out.println("" + numero3);}}


}
