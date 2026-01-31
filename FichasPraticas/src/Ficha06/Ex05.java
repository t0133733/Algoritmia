package Ficha06;

import java.util.Scanner;

public class Ex05 {
    public static void imprimirTabuada(int num) {
        int resultado;
        for (int i = 1; i <= 10; i++) {
            resultado = num * i;
            System.out.println(num + "X" + i + ": " + resultado);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduza um número: ");
        int num = input.nextInt();
        imprimirTabuada(num);
    }
}
