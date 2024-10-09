import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        
        //Criar scanner para receber 10 numeros reais
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Você gostaria de saber dentre os dois grupos de 10 números que pussui qual é a soma entre cada posição?");
        System.out.println();

        //Criar o primeiro vetor
        double[] grupo1 = new double[10];

        //Pedir ao usuário para inserir os 10 múmeros
        System.out.println("insira o primeiro grupo de 10 números");
        System.out.println();

        //Criar "for" para armazenar cada número em uma das 10 posições do vetor
        for (int i = 0; i < 10; i++){

            //Aproveitar o "for" para criar campos mais organizados para o usuário inserir os 10 número 
            System.out.println("Digite o número " + (i + 1) + ":");

            //Ler o número digitado e retornar o número para ser armazenado na posição i do vetor "números", para que a posição i possa ser usado no "for".
            grupo1[i] = scanner.nextDouble();
        }

        //Criar vetor 2
        double[] grupo2 = new double[10];

        //Pedir ao usuário para inserir os 10 múmeros
        System.out.println("insira o segundo grupo de 10 números");
        System.out.println();

        //Criar "for" para armazenar cada número em uma das 10 posições do vetor
        for (int i = 0; i < 10; i++){

            //Aproveitar o "for" para criar campos mais organizados para o usuário inserir os 10 número 
            System.out.println("Digite o número " + (i + 1) + ":");

            //Ler o número digitado e retornar o número para ser armazenado na posição i do vetor "números", para que a posição i possa ser usado no "for".
            grupo2[i] = scanner.nextDouble();
        }

        //Vetor soma
        double[] vetorsoma = new double[10];
        //Somando
        for (int i = 0; i < 10; i++){
            vetorsoma[i] = grupo1[i] + grupo2[i];
        }

        // Mostrar o primeiro vetor
        System.out.println("Primeiro grupo:");
        for (int i = 0; i < 10; i++) {
            System.out.print(grupo1[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Mostrar o segundo vetor
        System.out.println("Segundo grupo:");
        for (int i = 0; i < 10; i++) {
            System.out.print(grupo2[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Mostrar o vetor da soma
        System.out.println("Vetor da soma:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorsoma[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Fechar
        scanner.close();
 
    }
}