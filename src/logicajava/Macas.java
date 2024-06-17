package logicajava;

import java.util.Scanner;

public class Macas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de maçãs compradas:");
        int quantidade = scanner.nextInt();

        double precoUnitario;
        
        if (quantidade < 12) {
            precoUnitario = 0.50;
        } else {
            precoUnitario = 0.40;
        }

        double valorTotal = quantidade * precoUnitario;

        System.out.println("O valor total a ser pago é: R$" + valorTotal);

        scanner.close();
    }
}

