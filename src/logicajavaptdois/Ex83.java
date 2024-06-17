package logicajavaptdois;

import java.util.Scanner;

public class Ex83 {

	public static void main(String[] args) {
		// Crie um programa que leia 7 números inteiros e exiba a média aritmética dos valores lidos.
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        
        System.out.println("Digite 7 números inteiros:");
        
        for (int i = 1; i <= 7; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }
        
        double media = (double) soma / 7;
        System.out.println("A média aritmética dos 7 números é: " + media);
        
        scanner.close();

	}

}
