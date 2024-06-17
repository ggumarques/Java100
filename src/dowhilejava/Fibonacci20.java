package dowhilejava;

public class Fibonacci20 {
    public static void main(String[] args) {
        int primeiroNumero = 0;
        int segundoNumero = 1;
        int contador = 0;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");

        do {
            System.out.print(primeiroNumero + " ");

            int proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;

            contador++;
        } while (contador < 20);
    }
}
