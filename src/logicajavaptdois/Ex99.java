package logicajavaptdois;

import java.util.Scanner;

public class Ex99{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizSoma = new int[2][2];
        
        System.out.println("Digite os elementos da primeira matriz 2x2:");
        lerMatriz(scanner, matriz1);
        
        System.out.println("Digite os elementos da segunda matriz 2x2:");
        lerMatriz(scanner, matriz2);
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        System.out.println("Matriz soma:");
        exibirMatriz(matrizSoma);
        
        scanner.close();
    }
    
    public static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

