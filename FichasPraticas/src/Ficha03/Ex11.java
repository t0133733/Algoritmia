package Ficha03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um limite: ");
        int limite= input.nextInt();

        System.out.print("Introduza um salto: ");
        int salto= input.nextInt();

        int loop=0;

        while (loop<limite){
            System.out.println(loop);
            loop=salto+loop;
        }



    }
}
