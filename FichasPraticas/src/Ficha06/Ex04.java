package Ficha06;

import java.util.Scanner;

public class Ex04 {

    public static int areaRetangulo(int num1, int num2) {
        int area = num1 * num2;
        return area;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduza a altura: ");
        int altura = input.nextInt();
        System.out.print("Introduza a base: ");
        int base = input.nextInt();
        System.out.println("Área do retângulo: " + areaRetangulo(altura, base));
    }
}
