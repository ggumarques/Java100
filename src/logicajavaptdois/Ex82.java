package logicajavaptdois;

import java.util.Scanner;

public class Ex82 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        
        System.out.println("Digite 10 números inteiros:");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }
        
        System.out.println("A soma dos 10 números é: " + soma);
        
        scanner.close();

	}

}
