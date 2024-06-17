package logicajavaptdois;
import java.util.Scanner;
public class Ex89 {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        int contadorPositivos = 0;
	        int contadorNegativos = 0;
	        
	        System.out.println("Digite 10 números inteiros:");
	        
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Número " + i + ": ");
	            int numero = scanner.nextInt();
	            
	            if (numero > 0) {
	                contadorPositivos++;
	            } else if (numero < 0) {
	                contadorNegativos++;
	            }
	        }
	        
	        System.out.println("Quantidade de números positivos: " + contadorPositivos);
	        System.out.println("Quantidade de números negativos: " + contadorNegativos);
	        
	        scanner.close();
	 }
	 
}
