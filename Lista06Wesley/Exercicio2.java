import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        
        //Criar um sacanner para receber os 10 números reais
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Você gostaria de saber se dentre os 10 números que pussui quais são negativos e quais suas posições ?");
        System.out.println();

        //Criar vetor para armazenar os números reais
        double[] numeros = new double[10];

        //Pedir ao usuário para inserir os 10 múmeros
        System.out.println("insira 10 número reais");
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

        //Mostrar a posição dos números negativos no vetor
        System.out.println("A posição dos números negativos são: ");
        for (int i = 0; i < 10; i++){
            
            //Buscar somente os números negativos (menor que 0)
            if (numeros[i] < 0) {

                //Mostar os números negativos e sua posição
                System.out.println("O número negativo " + numeros[i] + " encontra-se na posição: " + i);
                
            }
        }

        //Fechar
        scanner.close();
    }
    
}
