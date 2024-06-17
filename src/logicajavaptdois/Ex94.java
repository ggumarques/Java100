package logicajavaptdois;
import java.util.Scanner;
public class Ex94 {

	public static void main(String[] args) {
		// Escreva um programa que leia 7 números inteiros e exiba apenas os números pares.

		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite 7 números inteiros:");
	        
	        for (int i = 1; i <= 7; i++) {
	            System.out.print("Número " + i + ": ");
	            int numero = scanner.nextInt();
	            
	            if (numero % 2 == 0) {
	                System.out.println(numero);
	            }
	        }
	        
	        scanner.close();
	}

}
