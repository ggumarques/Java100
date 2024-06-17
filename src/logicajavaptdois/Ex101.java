
package logicajavaptdois;

import java.util.Scanner;

public class Ex101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int soma = 0;
        
        System.out.println("Digite os elementos da matriz 4x4:");
        
        // Loop para ler os elementos da matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j]; // Adiciona cada elemento à soma
            }
        }
        
        double media = (double) soma / (4 * 4); // Calcula a média
        
        System.out.println("Matriz digitada:");
        
        // Loop para exibir a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha após cada linha da matriz
        }
        
        System.out.println("A média aritmética dos elementos da matriz é: " + media);
        
        scanner.close();
    }
}

