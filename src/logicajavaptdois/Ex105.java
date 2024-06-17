package logicajavaptdois;

import java.util.Scanner;

public class Ex105{
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
        
        // Calcular a soma de cada coluna
        int[] somaColunas = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                somaColunas[j] += matriz[i][j];
            }
        }
        
        // Exibir a soma de cada coluna
        System.out.println("Soma dos elementos de cada coluna:");
        for (int j = 0; j < 4; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
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

