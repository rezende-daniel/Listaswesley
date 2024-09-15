import java.util.Scanner;

class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anoAtual;
        int anoNascimento;
        

        System.out.println("Insira o ano atual: ");
        anoAtual = teclado.nextInt();
        System.out.println("Insira seu ano de nascimento: ");
        anoNascimento= teclado.nextInt();
        

        int idade= anoAtual-anoNascimento;
        System.out.println("Você tem "+idade+"anos");

        int idade2050= 2050-anoNascimento;
        System.out.println("Você tera "+idade2050+" anos em 2050");


    }
}
