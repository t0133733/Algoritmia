package Ficha01;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lado1,lado2,perimetro, area;

        System.out.print("Lado 1: ");

        lado1 = input.nextInt();

        System.out.print("Lado 2: ");

        lado2 = input.nextInt();


        perimetro = lado1 + lado1 + lado2 + lado2;
        area = lado1 * lado2;

        System.out.println("Perímetro:" + perimetro);
        System.out.println("Área:" + area);}




}
