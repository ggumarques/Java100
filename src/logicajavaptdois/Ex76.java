package logicajavaptdois;

import java.util.Scanner;

public class Ex76 {
	public static void main(String[] args) {
		// Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido.
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();
	        
	        int somaPares = 0;
	        for (int i = 2; i <= numero; i += 2) {
	            somaPares += i;
	        }
	        
	        System.out.println("A soma dos números pares de 1 a " + numero + " é: " + somaPares);
	        
	        scanner.close();

	}

}
