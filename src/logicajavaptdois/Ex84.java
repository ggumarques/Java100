package logicajavaptdois;

import java.util.Scanner;

public class Ex84 {

	public static void main(String[] args) {
		// Faça um programa que leia 5 números inteiros e exiba quantos deles são pares.
        Scanner scanner = new Scanner(System.in);
        
        int contadorPares = 0;
        
        System.out.println("Digite 5 números inteiros:");
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + contadorPares);
        
        scanner.close();

	}

}
