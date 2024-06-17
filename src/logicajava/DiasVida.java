package logicajava;

import java.util.Scanner;

public class DiasVida {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa:");
        System.out.print("Anos: ");
        int anos = scanner.nextInt();
        System.out.print("Meses: ");
        int meses = scanner.nextInt();
        System.out.print("Dias: ");
        int dias = scanner.nextInt();

        int totalDias = anos * 365 + meses * 30 + dias;

        System.out.println("A pessoa tem " + totalDias + " dias de vida.");

        scanner.close();
    }
}

