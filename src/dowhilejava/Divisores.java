package dowhilejava;

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("O número deve ser positivo.");
        } else {
            System.out.println("Os divisores de " + numero + " são:");

            int divisor = 1; 

            do {
                if (numero % divisor == 0) {
                    System.out.println(divisor);
                }
                divisor++; 
            } while (divisor <= numero);
        }

        scanner.close();
    }
}
