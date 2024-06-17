package logicajavaptdois;

import java.util.Scanner;

public class Ex107{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os elementos da matriz 3x3:");
        
        // Loop para ler os elementos da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Matriz digitada:");
        exibirMatriz(matriz);
        
        // Calcular o produto dos elementos da diagonal secundária
        int produtoDiagonal = 1;
        for (int i = 0; i < 3; i++) {
            produtoDiagonal *= matriz[i][2 - i];
        }
        
        // Exibir o produto dos elementos da diagonal secundária
        System.out.println("O produto dos elementos da diagonal secundária é: " + produtoDiagonal);
        
        scanner.close();
    }
    
    // Método para exibir uma matriz 3x3
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha após cada linha da matriz
        }
    }
}
