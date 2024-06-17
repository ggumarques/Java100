package logicajavaptdois;

import java.util.Scanner;

public class Ex74{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 5;
        int somaIdades = 0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            
            somaIdades += idade;
        }
        
        double mediaIdades = (double) somaIdades / totalPessoas;
        System.out.println("A média das idades das 5 pessoas é: " + mediaIdades);
        
        scanner.close();
    }
}
