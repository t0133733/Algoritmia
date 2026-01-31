package Ficha06;

public class Ex06 {
    public static boolean parOuImpar(int num) {
        if (num % 2 == 0) {
            System.out.println("Par");
            return true;
        } else {
            System.out.println("Ímpar");
            return false;
        }
    }

    public static boolean positivoOuNegativo(int num) {
        if (num >= 0) {
            System.out.println("Positivo");
            return true;
        } else {
            System.out.println("Negativo");
            return false;
        }
    }

    public static boolean primo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não Primo");
                return false;
            }
        }
        System.out.println("Primo");
        return true;
    }

    public static boolean perfeito(int num) {
        int perfeito = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                perfeito = perfeito + i;
            }
        }
        if (perfeito == num) {
            System.out.println("Perfeito");
            return true;
        }
        System.out.println("Não perfeito");
        return false;
    }

    public static boolean triangular(int num) {
        int soma = 0;
        for (int i = 0; soma < num; i++) {
            soma = soma + i;
        }
        if (soma == num) {
            System.out.println("Triangular");
            return true;
        }
        System.out.println("Não triangular");
        return false;
    }
}
