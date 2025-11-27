package Ficha03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Introduza um número (início): ");
        int inicio= input.nextInt();

        System.out.print("Introduza um número (fim): ");
        int fim= input.nextInt();

        int multiplo=inicio;

        if (multiplo%5!=0){
        multiplo=multiplo+5 - (multiplo%5);
        }
        while (multiplo<=fim){
            System.out.println(multiplo);
            multiplo=multiplo+5;
        }

    }
}
