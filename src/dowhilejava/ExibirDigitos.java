package dowhilejava;

import java.util.Scanner;

public class ExibirDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        System.out.println("Os dígitos do número " + numero + " são:");

        int temp = numero;
        do {
            int digito = temp % 10;
            System.out.println(digito);
            temp /= 10;
        } while (temp != 0);

        scanner.close();
    }
}
