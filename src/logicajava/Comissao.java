package logicajava;

import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: R$");
        double salarioBase = scanner.nextDouble();

        double comissao = 0.05 * salarioBase;

        double salarioLiquido = salarioBase + comissao;

        System.out.println("O salário líquido do funcionário é: R$" + salarioLiquido);

        scanner.close();
    }
}
