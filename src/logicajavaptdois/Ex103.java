package logicajavaptdois;

import java.util.Scanner;

public class Ex103{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int menorValor = Integer.MAX_VALUE; // Inicializa o menor valor com o maior valor possível
        
        System.out.println("Digite os elementos da matriz 3x3:");
        
        // Loop para ler os elementos da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                
                // Verifica se o elemento é menor que o menor valor atual
                if (matriz[i][j] < menorValor) {
                    menorValor = matriz[i][j];
                }
            }
        }
        
        System.out.println("Matriz digitada:");
        
        // Loop para exibir a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha após cada linha da matriz
        }
        
        System.out.println("O menor valor presente na matriz é: " + menorValor);
        
        scanner.close();
    }
}
