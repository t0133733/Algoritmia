package Ficha01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, pi, area;

        System.out.print("Raio:" );

        raio = input.nextDouble();

        pi = 3.14;

        area = raio * raio * pi;

        System.out.println("Área da circunferência: " + area);}

}
