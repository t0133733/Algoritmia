package Ficha04;

import java.util.Scanner;

public class Ex03 {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Insira um número: ");
    int num = input.nextInt();

    int divisor;

    for (divisor = 1; divisor <= num; divisor++) {
        if (num % divisor == 0)
            System.out.println(divisor);

    }

}
}

