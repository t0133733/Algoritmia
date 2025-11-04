package Ficha02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número: ");
        int numero1= input.nextInt();
        System.out.print("Introduza um número: ");
        int numero2= input.nextInt();
        System.out.print("Introduza um número: ");
        int numero3= input.nextInt();

        if (numero1>numero2 && numero2>numero3){
            System.out.println(numero1+" "+numero2+" "+numero3);}

        if (numero1>numero2 && numero3>numero2){
            System.out.println(numero1+" "+numero3+" "+numero2);}

        if (numero2>numero1 && numero1>numero3){
            System.out.println(numero2+" "+numero1+" "+numero3);}

        if (numero2>numero1 && numero3>numero1){
            System.out.println(numero2+" "+numero3+" "+numero1);}

        if (numero3>numero1 && numero1>numero2){
            System.out.println(numero3+" "+numero1+" "+numero2);}

        if (numero3>numero1 && numero2>numero1){
            System.out.println(numero3+" "+numero2+" "+numero1);}
        }
}
