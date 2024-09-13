import java.util.Scanner;

class Exercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de dados

        System.out.println("Insira o primeiro número: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Insira o segundo número: ");
        float nota2 = teclado.nextFloat();
        System.out.println("Insira o terceiro número: ");
        float nota3 = teclado.nextFloat();

        //Manipulação de dados
        float media = (nota1 + nota2 + nota3)/3;
        System.out.println("A média aritimetca dos núemros é "+media);
        }
    }