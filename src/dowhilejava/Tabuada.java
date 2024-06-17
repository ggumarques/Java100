package dowhilejava;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada:");
        int numero = scanner.nextInt();

        int contador = 1; 

        System.out.println("Tabuada do número " + numero + ":");

        do {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++; 
        } while (contador <= 10);

        scanner.close();
    }
}
