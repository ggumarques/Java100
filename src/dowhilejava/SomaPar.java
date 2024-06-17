package dowhilejava;

import java.util.Scanner;

public class SomaPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        int soma = 0; 
        int contador = 2; 

        do {
            soma += contador; // Adiciona o número par à soma
            contador += 2; // Incrementa o contador para passar para o próximo número par
        } while (contador <= numero);

        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);

        scanner.close();
    }
}
