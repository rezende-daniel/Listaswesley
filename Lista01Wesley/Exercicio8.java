import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso;
        

        System.out.println("Insira o peso: ");
        peso = teclado.nextDouble();
       
        

        double pesoMais = peso*1.15;
        double pesoMenos = peso*0.8;

        System.out.println("Se a pessoa engordar 15% ela tera " +pesoMais+" quilos" );
        System.out.println("Se a pessoa emagrecer 20% ela tera "+pesoMenos+" quilos");

    }
}