package logicajava;

import java.util.Scanner;

public class Poupanca {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito mensal: R$");
        double depositoMensal = scanner.nextDouble();
        
        System.out.print("Digite a taxa de juros mensal (em porcentagem): ");
        double taxaJurosMensal = scanner.nextDouble();

        taxaJurosMensal /= 100;

        double montante = 0;

        for (int i = 1; i <= 12; i++) {

            montante += depositoMensal;

            montante *= (1 + taxaJurosMensal);
        }

        System.out.println("O montante após 12 meses é: R$" + montante);

        scanner.close();
    }
}
