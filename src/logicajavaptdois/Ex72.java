package logicajavaptdois;

import java.util.Scanner;

public class Ex72 {

	public static void main(String[] args) {
		//Faça um programa que leia um número inteiro e exiba se ele é um número primo.

		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        boolean primo = verificarPrimo(numero);
        
        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        scanner.close();
	}

public static boolean verificarPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    
    return true;
}
}
