package Ficha03;

import java.util.Scanner;

public class Ex15v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número: ");
        int num = input.nextInt();
        int resultado = 1;
        int fatorial = num;

        while (fatorial > 1) {
            int x = 0;
            int y = resultado;
            while (y > 0) {
                x = x + fatorial;
                y = y - 1;
            }
            resultado = x;
            fatorial = fatorial - 1;

            System.out.println(resultado);
        }
    }
}
