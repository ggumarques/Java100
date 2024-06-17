package logicajava;

import java.util.Scanner;

public class MediaArit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números reais para calcular a média aritmética:");

        System.out.print("Número 1: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Número 2: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Número 3: ");
        double numero3 = scanner.nextDouble();

        double mediaAritmetica = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média aritmética dos números é: " + mediaAritmetica);

        scanner.close();
    }
}
