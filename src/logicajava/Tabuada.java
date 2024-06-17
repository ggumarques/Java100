package logicajava;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ver a sua tabuada de multiplicação: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicação de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
