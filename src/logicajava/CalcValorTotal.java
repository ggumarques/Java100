package logicajava;

import java.util.Scanner;

public class CalcValorTotal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o preço do produto: R$");
		double precoProduto = scanner.nextDouble();

		System.out.print("Digite a quantidade comprada: ");
		int quantidadeComprada = scanner.nextInt();

		double valorTotalSemDesconto = precoProduto * quantidadeComprada;

		double valorTotalComDesconto = quantidadeComprada > 10 ? valorTotalSemDesconto * 0.9 : valorTotalSemDesconto;

		System.out.println("O valor total a ser pago é: R$" + valorTotalComDesconto);

		scanner.close();
	}
}