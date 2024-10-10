import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        
        //Criar scanner para receber 10mnumeros reais
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Você gostaria de saber dentre os 10 números que pussui quais estão nas posições pares?");
        System.out.println();

        //Criar vetor para armazenar os números reais
        double[] numeros = new double[10];

        //Pedir ao usuário para inserir os 10 múmeros
        System.out.println("insira 10 número");
        System.out.println();

        //Criar "for" para armazenar cada número em uma das 10 posições do vetor
        for (int i = 0; i < 10; i++){

            //Aproveitar o "for" para criar campos mais organizados para o usuário inserir os 10 número 
            System.out.println("Digite o número " + (i + 1) + ":");

            //Ler o número digitado e retornar o número para ser armazenado na posição i do vetor "números", para que a posição i possa ser usado no "for".
            numeros[i] = scanner.nextDouble();
        }

        //Mostrar os números inseridos
        System.out.println("Os números digitados foram: ");
        for (int i = 0; i < 10; i++){
            System.out.println(numeros[i] + " ");
        }

        //Mostrar os numeros em posições pares
        System.out.println("Os números que estão nas posições pares são: ");
        //Buscar somente as posições pares ou seja busca a 0 e pula de 2 em 2
        for (int i = 0; i < 10; i += 2) {
            System.out.println("Número " + numeros[i] + " na posição " + i);
        }

        //Fechar
        scanner.close();
    }
    
}

