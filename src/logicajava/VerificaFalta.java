package logicajava;

import java.util.Scanner;

public class VerificaFalta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de faltas do aluno:");
        int faltas = scanner.nextInt();

        if (faltas > 15) {
            System.out.println("O aluno está reprovado por falta.");
        } else {
            System.out.println("O aluno está aprovado.");
        }

        scanner.close();
    }
}

