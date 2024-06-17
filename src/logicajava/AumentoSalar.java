package logicajava;

import java.util.Scanner;

public class AumentoSalar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: R$");
        double salarioAtual = scanner.nextDouble();

        double novoSalario = salarioAtual * 1.15;

        System.out.println("O novo salário do funcionário, com aumento de 15%, é: R$" + novoSalario);

        scanner.close();
    }
}

