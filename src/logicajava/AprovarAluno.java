package logicajava;

import java.util.Scanner;

public class AprovarAluno {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as três notas do aluno:");
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("O aluno foi aprovado com média " + media);
        } else {
            System.out.println("O aluno foi reprovado com média " + media);
        }

        scanner.close();
    }
}
