package logicajavaptdois;

import java.util.Scanner;

public class Ex108{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        
        System.out.println("Digite os elementos da matriz 4x4:");
        
        // Loop para ler os elementos da matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Matriz digitada:");
        exibirMatriz(matriz);
        
        // Encontrar o maior valor de cada linha
        int[] maioresPorLinha = new int[4];
        for (int i = 0; i < 4; i++) {
            int maiorLinha = Integer.MIN_VALUE;
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maiorLinha) {
                    maiorLinha = matriz[i][j];
                }
            }
            maioresPorLinha[i] = maiorLinha;
        }
        
        // Exibir o maior valor de cada linha
        System.out.println("O maior valor presente em cada linha:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Linha " + (i + 1) + ": " + maioresPorLinha[i]);
        }
        
        scanner.close();
    }
    
    // Método para exibir uma matriz 4x4
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha após cada linha da matriz
        }
    }
}

