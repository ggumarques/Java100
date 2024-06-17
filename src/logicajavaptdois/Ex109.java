package logicajavaptdois;

import java.util.Scanner;

public class Ex109{
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
        
        // Verificar se a matriz é identidade
        boolean identidade = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriz[i][j] != 1) { // Diagonal principal deve ser 1
                    identidade = false;
                    break;
                } else if (i != j && matriz[i][j] != 0) { // Fora da diagonal principal deve ser 0
                    identidade = false;
                    break;
                }
            }
            if (!identidade) {
                break;
            }
        }
        
        if (identidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }
        
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
