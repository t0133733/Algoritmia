package Ficha06;

import java.util.Scanner;

public class Ex01 {

    public static int inteiroPositivo() {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduza um número: ");
            num = input.nextInt();
            if (num < 1) {
                System.out.println("Número inválido");
            }
        } while (num < 1);
        return num;
    }
    public static void numeroAsteriscos(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        int num = inteiroPositivo();
        numeroAsteriscos(num);
    }
}
