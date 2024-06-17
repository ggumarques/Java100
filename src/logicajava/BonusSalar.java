package logicajava;

import java.util.Scanner;

public class BonusSalar {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o salário do funcionário: R$");
		double salario = scanner.nextDouble();

		double bonus;
		if (salario > 2000) {
			bonus = salario * 0.10;
			bonus = salario * 0.05;
		}

		System.out.println("O valor do bônus do funcionário é: R$" + bonus);

		scanner.close();
	}
}
