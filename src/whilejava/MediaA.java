package whilejava;

import java.util.Scanner;

public class MediaA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1; 
        int soma = 0; 

        while (contador <= 5) {
            System.out.println("Digite o número " + contador + ":");
            int numero = scanner.nextInt();
            soma += numero; 
            contador++;
        }

        double media = (double) soma / 5;

        System.out.println("A média aritmética dos números é: " + media);

        scanner.close();
    }
}

