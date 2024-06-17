package whilejava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int primeiroNumero = 0;
        int segundoNumero = 1;

        System.out.println("Sequência de Fibonacci até " + numero + ":");

        while (primeiroNumero <= numero) {
            System.out.print(primeiroNumero + " ");

            int proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }

        scanner.close();
    }
}
