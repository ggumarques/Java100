package logicajavaptdois;

public class Ex75 {

	public static void main(String[] args) {
		//Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci.
		
		 int limite = 20;
	        System.out.println("Os primeiros " + limite + " números da sequência de Fibonacci são:");
	        
	        int anterior = 0;
	        int atual = 1;
	        System.out.print(anterior + " " + atual + " ");
	        
	        for (int i = 3; i <= limite; i++) {
	            int proximo = anterior + atual;
	            System.out.print(proximo + " ");
	            anterior = atual;
	            atual = proximo;
	        }
	}

}
