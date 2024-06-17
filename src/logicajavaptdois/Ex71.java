package logicajavaptdois;

import java.util.Scanner;

public class Ex71 {

	public static void main(String[] args) {
		//Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número.

		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        System.out.println("Divisores de " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close();
	}

}
