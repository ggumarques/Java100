package whilejava;

import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 5; 
        int contador = 0; 
        int somaIdades = 0; 
        
        while (contador < totalPessoas) {
            System.out.println("Digite o nome da pessoa " + (contador + 1) + ":");
            System.out.println("Digite a idade da pessoa " + (contador + 1) + ":");
            int idade = scanner.nextInt();


            somaIdades += idade; 
            contador++; 
        }

        double media = (double) somaIdades / totalPessoas;
        System.out.println("A média das idades das 5 pessoas é: " + media);

        scanner.close();
    }
}
