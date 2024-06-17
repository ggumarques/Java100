package logicajavaptdois;

import java.util.Scanner;

public class Ex78 {

	public static void main(String[] args) {
		// Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente.

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        System.out.println("Os dígitos do número " + numero + " são:");
        exibirDigitos(numero);
        
        scanner.close();
		
	}
    public static void exibirDigitos(int numero) {
        String numeroStr = Integer.toString(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            System.out.println(numeroStr.charAt(i));
        }
    }
}



