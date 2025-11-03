package Ficha02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salario;

        System.out.print("Introduza o salário: ");
        salario= input.nextInt();

        if (salario >= 15000)

            System.out.println("Paga taxa de 30%: " + salario * .30 );

        else

            System.out.println("Paga taxa de 20%: " + salario * .20);}

}
