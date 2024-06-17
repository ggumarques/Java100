package whilejava;

import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;
        int divisor = 2; 
        if (numero <= 1) {
            ehPrimo = false;
        }

        while (divisor <= numero / 2) {
            if (numero % divisor == 0) {
                ehPrimo = false;
                break; 
            }
            divisor++; 
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
