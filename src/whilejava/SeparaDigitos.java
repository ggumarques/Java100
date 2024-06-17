package whilejava;

import java.util.Scanner;

public class SeparaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        System.out.println("Os dígitos do número " + numero + " são:");

        int temp = numero;
        while (temp != 0) {
            int digito = temp % 10;
            System.out.println(digito);
            temp /= 10;
        }

        scanner.close();
    }
}
