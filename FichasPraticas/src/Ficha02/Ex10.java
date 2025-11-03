package Ficha02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero1, numero2;

        System.out.print("Insira um número: ");
        numero1= input.nextDouble();
        System.out.print("Insira outro número: ");
        numero2= input.nextDouble();
        System.out.print("Qual a operação aritmética que pretende realizar? : ");
        String operacao= input.next();

        switch (operacao){
            case "+":
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case "-":
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case "*":
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case "/":
                if (numero2==0){
                    System.out.println("ERROR");}
                else {
                System.out.println("Resultado: " + (numero1 / numero2));}
                break;

            default:
                System.out.println("ERROR");}}




}
