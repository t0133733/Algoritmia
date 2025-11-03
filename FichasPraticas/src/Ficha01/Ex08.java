package Ficha01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int segundos1, minutos1, segundos2, minutos2, segundos3, minutos3, segundos4, minutos4, segundos5, minutos5;

        System.out.print("Segundos da música 1: ");
        segundos1 = input.nextInt();
        System.out.print("Minutos da música 1: ");
        minutos1 = input.nextInt();

        System.out.print("Segundos da música 2: ");
        segundos2 = input.nextInt();
        System.out.print("Minutos da música 2: ");
        minutos2 = input.nextInt();

        System.out.print("Segundos da música 3: ");
        segundos3 = input.nextInt();
        System.out.print("Minutos da música 3: ");
        minutos3 = input.nextInt();

        System.out.print("Segundos da música 4: ");
        segundos4 = input.nextInt();
        System.out.print("Minutos da música 4: ");
        minutos4 = input.nextInt();

        System.out.print("Segundos da música 5: ");
        segundos5 = input.nextInt();
        System.out.print("Minutos da música 5: ");
        minutos5 = input.nextInt();

        int totalSegundos = segundos1 + segundos2 + segundos3 + segundos4 + segundos5;
        int totalMinutos = minutos1 + minutos2 + minutos3 + minutos4 + minutos5;

        int minutosAdicionais = totalSegundos / 60;
        int segundosRestantes = totalSegundos - (minutosAdicionais * 60);

        int minutosTotais = totalMinutos + minutosAdicionais;

        // Convert minutes to hours
        int horasTotais = minutosTotais / 60;
        int minutosRestantes = minutosTotais - (horasTotais * 60);


        System.out.println("Total do Álbum: " + horasTotais + "h " + minutosRestantes + "m " + segundosRestantes + "s");}
}