package logicajavaptdois;

import java.util.Scanner;

public class Ex87 {

	public static void main(String[] args) {
		// faça um programa que leia 10 números inteiros e exiba quantos deles são positivos.

		Scanner scanner = new Scanner(System.in);
        
        int contadorPositivos = 0;
        
        System.out.println("Digite 10 números inteiros:");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero > 0) {
                contadorPositivos++;
            }
        }
        
        System.out.println("Quantidade de números positivos: " + contadorPositivos);
        
        scanner.close();
	}

}
