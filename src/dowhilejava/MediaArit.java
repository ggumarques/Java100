package dowhilejava;

import java.util.Scanner;

public class MediaArit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 5; 
        int contador = 0; 
        int soma = 0; 

        do {
            System.out.println("Digite o número " + (contador + 1) + ":");
            int numero = scanner.nextInt();
            soma += numero; 
            contador++; 
        } while (contador < totalNumeros);

        double media = (double) soma / totalNumeros;

        System.out.println("A média aritmética dos números é: " + media);

        scanner.close();
    }
}
