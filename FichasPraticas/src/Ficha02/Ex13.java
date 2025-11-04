package Ficha02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza horas: ");
        int horas= input.nextInt();

        System.out.print("Introduza minutos: ");
        int minutos= input.nextInt();

        if (horas==13){
            System.out.println("1:"+minutos+" PM");}
        if (horas==14){
            System.out.println("2:"+minutos+" PM");}
        if (horas==15){
            System.out.println("3:"+minutos+" PM");}
        if (horas==16){
            System.out.println("4:"+minutos+" PM");}
        if (horas==17){
            System.out.println("5:"+minutos+" PM");}
        if (horas==18){
            System.out.println("6:"+minutos+" PM");}
        if (horas==19){
            System.out.println("7:"+minutos+" PM");}
        if (horas==20){
            System.out.println("8:"+minutos+" PM");}
        if (horas==21){
            System.out.println("9:"+minutos+" PM");}
        if (horas==22){
            System.out.println("10:"+minutos+" PM");}
        if (horas==23){
            System.out.println("11:"+minutos+" PM");}
        if (horas==24){
            System.out.println("00:"+minutos+" PM");}
        if (horas<=12)
            System.out.println(horas+":"+minutos+" AM");




    }
}
