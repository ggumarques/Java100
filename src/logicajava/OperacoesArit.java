package logicajava;

import java.util.Scanner;

public class OperacoesArit {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");

        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();

        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtração: " + (numero1 - numero2));
        System.out.println("Multiplicação: " + (numero1 * numero2));
        
        if (numero2 != 0) {
            System.out.println("Divisão: " + ((double) numero1 / numero2));
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        scanner.close();
    }
}

