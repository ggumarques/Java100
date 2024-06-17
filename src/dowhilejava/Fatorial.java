package dowhilejava;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inteiro para calcular o fatorial:");
		int numero = scanner.nextInt();

		if (numero < 0) {
			System.out.println("O número deve ser não-negativo.");
		} else {
			int fatorial = 1;
			int contador = 1;

			do {
				fatorial *= contador;
				contador++;
			} while (contador <= numero);

			System.out.println("O fatorial de " + numero + " é: " + fatorial);
		}

		scanner.close();
	}
}
