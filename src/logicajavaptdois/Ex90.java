package logicajavaptdois;

import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean encontrado = false;
        
        System.out.println("Digite 5 números:");
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero == 0) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("Foi encontrado um número igual a zero.");
        } else {
            System.out.println("Nenhum número igual a zero foi encontrado.");
        }
        
        scanner.close();
    }
}
