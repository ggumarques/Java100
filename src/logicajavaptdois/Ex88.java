package logicajavaptdois;

import java.util.Scanner;

public class Ex88 {

	public static void main(String[] args) {
		//Escreva um programa que leia 5 números inteiros e calcule a média dos valores pares e a média dos valores ímpares.
        Scanner scanner = new Scanner(System.in);
        
        int somaPares = 0;
        int somaImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        
        System.out.println("Digite 5 números inteiros:");
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                somaPares += numero;
                contadorPares++;
            } else {
                somaImpares += numero;
                contadorImpares++;
            }
        }
        
        if (contadorPares > 0) {
            double mediaPares = (double) somaPares / contadorPares;
            System.out.println("Média dos valores pares: " + mediaPares);
        } else {
            System.out.println("Não foram digitados números pares.");
        }
        
        if (contadorImpares > 0) {
            double mediaImpares = (double) somaImpares / contadorImpares;
            System.out.println("Média dos valores ímpares: " + mediaImpares);
        } else {
            System.out.println("Não foram digitados números ímpares.");
        }
        
        scanner.close();
    }
}


