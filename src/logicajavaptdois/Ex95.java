package logicajavaptdois;

import java.util.Arrays;
import java.util.Scanner;

public class Ex95{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[5];
        
        System.out.println("Digite 5 nomes:");
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        Arrays.sort(nomes);
        
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}
