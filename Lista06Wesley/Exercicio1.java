import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        //Criar scanner para receber os 10 números do usuário.
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Você gostaria de saber qual o resultado da soma dos números pares dos 10 números que pussui?");
        System.out.println();

        //Criar vetor para armazenar os números
        int[] numeros = new int[10];

        //Criar variável para armazenar a soma dos pares
        int SomaNumPar = 0;

        //Pedir ao usuário para inserir os 10 múmeros
        System.out.println("insira 10 números inteiros");
        System.out.println();

        //Criar "for" para armazenar cada número em uma das 10 posições do vetor
        for (int i = 0; i < 10; i++){

            //Aproveitar o "for" para criar campos mais organizados para o usuário inserir os 10 número 
            System.out.println("Digite o número " + (i + 1) + ":");

            //Ler o número digitado e retornar o número para ser armazenado na posição i do vetor "números", para que a posição i possa ser usado no "for".
            numeros[i] = scanner.nextInt();
        }

        //Mostrar os números inseridos
        System.out.println("Os números digitados foram: ");
        for (int i = 0; i < 10; i++){
            System.out.println(numeros[i] + " ");
        }

        //Somar os números pares
        for (int i = 0; i < 10; i++){

            //Se o numero for dividido por 2 e o seu resto for 0 é par
            if (numeros[i] % 2 == 0) {

                //E assim adicionamos outro número
                SomaNumPar += numeros[i];
                
            }
        }

        //Mostrar o resultado
        System.out.println("O resultado da soma dos números pares dentre os que nos foi fornecido é: " + SomaNumPar);

        //Fechar
        scanner.close();

    }
}
