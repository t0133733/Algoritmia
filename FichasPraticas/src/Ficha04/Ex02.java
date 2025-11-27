package Ficha04;

public class Ex02 {
    public static void main(String[] args) {


        int soma = 0;

        for (int num = 11; num <= 51; num = num + 2) {
            System.out.println(num);
            soma = soma + num;


        }
        System.out.println(soma);
    }
}