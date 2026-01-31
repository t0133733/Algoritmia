package Ficha06;

import java.util.Scanner;

public class Ex02 {

    public static int numeroMaisPequeno(int num1, int num2, int num3){

        if (num1<num2 && num1<num3){
            System.out.println("\nNúmero mais pequeno: "+num1);
        return num1;
        }
        if (num2<num1 && num2<num3){
            System.out.println("\nNúmero mais pequeno: "+num2);
        return num2;
        }else {
            System.out.println("\nNúmero mais pequeno: "+num3);
        return num3;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num1= input.nextInt();
        System.out.print("Insira um número: ");
        int num2= input.nextInt();
        System.out.print("Insira um número: ");
        int num3= input.nextInt();

        numeroMaisPequeno(num1,num2,num3);
    }
}
