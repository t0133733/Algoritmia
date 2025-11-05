package Ficha03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número: ");
        int numero1= input.nextInt();
        int numero2=0;

        while(numero2<=numero1){
            System.out.println(numero2);
            numero2=numero2+1;}

    }
}
