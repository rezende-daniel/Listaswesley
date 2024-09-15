import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Insira o valor do seu salario: ");
        Double salario = teclado.nextDouble();
        
        

        double salarioNovo= salario*1.25;
        System.out.println("Seu noovo salrio é de "+salarioNovo+" reais");



    }
}