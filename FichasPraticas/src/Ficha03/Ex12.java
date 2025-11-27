package Ficha03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;

        System.out.print("Introduza um número: ");
        int numero= input.nextInt();


        while (numero>=0){
            if (numero >= 0 && numero <= 25) {
                c1 = c1 + 1;
            } else if (numero >= 26 && numero <= 50) {
                c2 = c2 + 1;
            } else if (numero >= 51 && numero <= 75) {
                c3 = c3 + 1;
            } else if (numero >= 76 && numero <= 100) {
                c4 = c4 + 1;
            }

            System.out.print("Introduza um número: ");
            numero = input.nextInt();
        }

        System.out.println("[0,25]: " + c1);
        System.out.println("[26,50]: " + c2);
        System.out.println("[51,75]: " + c3);
        System.out.println("[76,100]: " + c4);
    }
}
