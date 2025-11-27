package Ficha02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salario;

        System.out.println("Introduza o salário: ");
        salario= input.nextInt();

        if (salario<=15000){

        System.out.println("Paga taxa de 20% " + salario * .20);}

        if (salario>15000 && salario<=20000){

        System.out.println("Paga taxa de 30%: " + salario * .30 );}

        if (salario>20000 && salario<=25000){

        System.out.println("Paga taxa de 35%: " + salario * .35);}

        if (salario>25000){

        System.out.println("Paga taxa de 40%: " + salario * .40);}}


}
