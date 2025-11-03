package Ficha02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o saldo: ");
        int saldo= input.nextInt();

        System.out.print("Saldo a movimentar: ");
        int saldomov= input.nextInt();

        int saldofinal=saldo+saldomov;

        if (saldofinal>saldo && saldofinal>=0){
            System.out.println("Operação realizada com sucesso: Depósito");
            System.out.println("Saldo atual: " + saldofinal);}

        if (saldofinal<saldo && saldofinal>=0){
            System.out.println("Operação realizada com sucesso: Levantamento");
            System.out.println("Saldo atual: " + saldofinal);}

        if (saldofinal<0){
            System.out.println("Operação inválida");}}
}
