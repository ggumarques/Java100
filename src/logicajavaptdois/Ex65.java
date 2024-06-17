package logicajavaptdois;

import java.util.Scanner;

public class Ex65 {

	public static void main(String[] args) {
		/*Crie um programa que leia o nome e a idade de várias pessoas usando o loop "do-while" até que o nome "fim" seja informado. Ao final, exiba a média das idades.*/
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int idade;
		int soma = 0;
		int cont = 0;
		
		do {
            System.out.print("Digite o nome (ou 'fim' para terminar): ");
            nome = scanner.nextLine();
            
            if(!nome.equalsIgnoreCase("fim")) {
            	System.out.print("Digite a idade: ");
            	idade = scanner.nextInt();
            	scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
            	
            	soma += idade;
            	cont++;
            }
		}while(!nome.equalsIgnoreCase("fim"));
		
		if(cont > 0) {
			double mediaIdades = (double) soma/cont;
			System.out.println("A média das idades é: " + mediaIdades);
		} else {
            System.out.println("Nenhuma idade foi informada.");
        }
        
        scanner.close();

	}

}
