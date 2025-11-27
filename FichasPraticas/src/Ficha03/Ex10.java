package Ficha03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número (2 ou superior): ");
        int numero= input.nextInt();
        int loop=2;

        while (loop<numero){
            System.out.println(loop);
        loop=loop+2;}}}
