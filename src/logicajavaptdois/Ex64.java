package logicajavaptdois;

import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {
		
		/*Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "do-while".*/
		
		Scanner scanner = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Digite um número inteiro positivo: ");
			num = scanner.nextInt();
			if(num < 0) {
				System.out.println("Número inválido. Por favor, insira um número positivo.");
			}
		} while(num < 0);
		
		long fatorial = 1;
		int i = 1;
		
		do {
			fatorial *= i;
			i++;
		}while (i <= num);
		System.out.println("O fatorial de " + num + " é " + fatorial);
		
		scanner.close();
	}
	
	

}
