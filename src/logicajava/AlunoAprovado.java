package logicajava;

import java.util.Scanner;

public class AlunoAprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a nota do aluno:");
        double nota = scanner.nextDouble();

        String situacao = "";
        if (nota >= 7) {
            situacao = "Aprovado";
        } else {
            situacao = "Em recuperação";
        }

        System.out.println("Situação do aluno " + nome + ": " + situacao);

        scanner.close();
    }
}
