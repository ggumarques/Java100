package logicajavaptdois;

import java.util.Scanner;

public class Ex80{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPessoas = 0;
        int somaIdades = 0;
        
        System.out.println("Digite o nome e a idade das pessoas (digite 'fim' para encerrar):");
        
        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
            
            totalPessoas++;
            somaIdades += idade;
        }
        
        if (totalPessoas > 0) {
            double mediaIdades = (double) somaIdades / totalPessoas;
            System.out.println("A média das idades das " + totalPessoas + " pessoas é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa foi inserida.");
        }
        
        scanner.close();
    }
}
