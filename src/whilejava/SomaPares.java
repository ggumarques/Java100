package whilejava;

import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        int soma = 0; 
        int contador = 1; 

        while (contador <= numero) {
            if (contador % 2 == 0) {
                soma += contador; 
            }
            contador++; 
        }

        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);

        scanner.close();
    }
}
