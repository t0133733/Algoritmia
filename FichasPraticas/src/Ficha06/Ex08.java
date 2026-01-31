package Ficha06;

public class Ex08 {

    public static void maiorElemento(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("Maior elemento do vetor: " + maior);
    }

    public static void menorElemento(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Menor elemento do vetor: " + menor);
    }

    public static void crescente(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[i - 1]) {
                System.out.println("Não Crescente");
                return;
            }
        }
        System.out.println("Crescente");
    }


}
