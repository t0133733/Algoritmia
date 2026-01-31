package Ficha06;

import java.util.Scanner;

public class Ex03 {

    public static double mediaAritmetica(double num1, double num2, double num3) {
        double media =  (num1 + num2 + num3) / 3;
        return media;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Introduza um número: ");
        int num1= input.nextInt();
        System.out.print("Introduza um número: ");
        int num2= input.nextInt();
        System.out.print("Introduza um número: ");
        int num3= input.nextInt();
        System.out.println("Média: "+mediaAritmetica(num1,num2,num3));
    }
}
