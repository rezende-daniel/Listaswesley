import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cotacaoDolar;
        double dolares;
        

        System.out.println("Insira a cotação do dolar em real: ");
        cotacaoDolar = teclado.nextDouble();
        System.out.println("Insira a quantidade de dolares que você possue: ");
        dolares= teclado.nextDouble();
        

        double real= dolares*cotacaoDolar;
        System.out.println("Você possue "+real+" reais");



    }
}