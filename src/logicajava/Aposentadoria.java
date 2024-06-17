package logicajava;

import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        System.out.println("Digite o sexo da pessoa (M ou F):");
        char sexo = scanner.next().charAt(0);

        if ((sexo == 'M' && idade >= 65) || (sexo == 'F' && idade >= 60)) {
            System.out.println("A pessoa pode se aposentar.");
        } else {
            System.out.println("A pessoa não pode se aposentar ainda.");
        }

        scanner.close();
    }
}
