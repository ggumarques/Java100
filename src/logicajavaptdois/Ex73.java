package logicajavaptdois;

import java.util.Scanner;

public class Ex73{
    public static void main(String[] args) {
    	//Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido.
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        System.out.println("Sequência de Fibonacci até " + numero + ":");
        for (int i = 0; fibonacci(i) <= numero; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        scanner.close();
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


