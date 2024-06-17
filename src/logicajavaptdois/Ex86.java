package logicajavaptdois;

import java.util.Arrays;
import java.util.Scanner;

 public class Ex86{
		// Crie um programa que leia 10 números inteiros e exiba-os em ordem crescente.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        System.out.println("Digite 10 números inteiros:");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        Arrays.sort(numeros);
        
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        scanner.close();
    }
}