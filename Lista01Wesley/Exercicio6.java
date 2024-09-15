import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        

        System.out.println("Insira a temperatura em celsius: ");
        celsius = teclado.nextDouble();
       
        

        fahrenheit= (celsius*1.8)+32;
        System.out.println("Está "+fahrenheit+" graus fahrenheit");



    }
}