package Ficha02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Nota 1: ");
        double nota1=input.nextDouble();
        if(nota1>=0 && nota1<=20){}

        System.out.print("Nota 2: ");
        double nota2= input.nextDouble();
        if(nota2>=0 && nota2<=20){}

        System.out.print("Nota 3: ");
        double nota3=input.nextDouble();
        if(nota3>=0 && nota3<=20){}

        double peso1, peso2, peso3, mediaponderada;
        peso1=.25;
        peso2=.35;
        peso3=.40;
        mediaponderada = ( (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) ) / (peso1 + peso2 + peso3);

        if (mediaponderada >= 9.5) {
            System.out.println("Aprovado");
        }
        else
            System.out.println("Não aprovado");}


}
