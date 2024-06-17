package logicajavaptdois;

import java.util.Scanner;

public class Ex102{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizProduto = new int[2][2];
        
        // Leitura da primeira matriz
        System.out.println("Digite os elementos da primeira matriz 2x2:");
        lerMatriz(scanner, matriz1);
        
        // Leitura da segunda matriz
        System.out.println("Digite os elementos da segunda matriz 2x2:");
        lerMatriz(scanner, matriz2);
        
        // Cálculo do produto das matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizProduto[i][j] = matriz1[i][0] * matriz2[0][j] + matriz1[i][1] * matriz2[1][j];
            }
        }
        
        // Exibição da matriz produto
        System.out.println("Matriz produto:");
        exibirMatriz(matrizProduto);
        
        scanner.close();
    }
    
    // Método para ler uma matriz 2x2
    public static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    
    // Método para exibir uma matriz 2x2
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha após cada linha da matriz
        }
    }
}

