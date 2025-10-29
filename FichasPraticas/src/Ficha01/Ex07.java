package Ficha01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double preco1, preco2, preco3, desconto;

                System.out.print("Preço 1: ");

                preco1 = input.nextDouble();

                System.out.print("Preço 2: ");

                preco2 = input.nextDouble();

                System.out.print("Preço 3: ");

                preco3 = input.nextDouble();

                desconto = (preco1 + preco2 + preco3) * .10;

                System.out.println("Desconto 10%: " + desconto );



        System.out.println("Total: " + (preco1 + preco2 + preco3 - desconto));
    }
    }
