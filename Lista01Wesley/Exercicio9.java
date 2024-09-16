import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        

        System.out.println("Insira o valor do primeiro cateto ");
         double cateto1 = teclado.nextDouble();
         System.out.println("Insira o valor do segudo cateto ");
         double cateto2 = teclado.nextDouble();
       
        

        double hipo = Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2,2));
        

        System.out.println("A hipotenusa vale " +hipo );
        

    }
}
