import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorSalarioMinimo;
        double salario;
        

        System.out.println("Insira o valor do salário mínimo: ");
        valorSalarioMinimo = teclado.nextDouble();
        System.out.println("Insira o salario do funcionario: ");
        salario = teclado.nextDouble();
       
        

        double numeroDeSalarios = salario/valorSalarioMinimo;

        System.out.println("O funcionario recebe " +numeroDeSalarios+" salarios" );


    }
}