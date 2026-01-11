package Ficha05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[]vetor=new int[10];

        for (int i=0;i<vetor.length;i++){
            System.out.print("Introduza no vetor["+i+"] o valor pretendido: ");
            vetor[i]= input.nextInt();
        }

        System.out.println("____________________________");

        int x=0;
        boolean y=false;

        for (int i=0;i<vetor.length;i++){
            if (vetor[i]%2==0){
                if (!y ||vetor[i]>x){
                    x=vetor[i];
                    y=true;
                }
            }
        }
        if (y){
            System.out.println("O maior número par é: " +x);
        }else {
            System.out.println("Não existem números pares");
        }


    }
}
