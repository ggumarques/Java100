package whilejava;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial:");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int contador = 1;

        while (contador <= numero) {
            fatorial *= contador; 
            contador++; 
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}

