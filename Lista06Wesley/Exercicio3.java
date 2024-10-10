import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        
        //Criar scanner para receber 10 numeros reais
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Você gostaria de saber dentre os 10 números reais que possui qual é o menor e  o maior?");
        System.out.println();

        //Criar um vetor para receber os 10 números
        double[] numeros = new double[10];
        
        //Pedir para o usuário digitar os 10 números
        System.out.println("Insira os 10 números que possui");
        System.out.println();

        //Criar o "for" para armazenar cada um dos 10 números em uma das posições do vetor 
        for (int i = 0; i < 10; i++){

            //Aproveitar o "for" para criar campos mais organizados para o usuário inserir os 10 número 
            System.out.println("Digite o número " + (i + 1) + ":");

            //Ler o número digitado e retorná-lo para ser armazenado na posição i do vetor "números", para que a posição i possa ser usado no "for".
            numeros[i] = scanner.nextDouble();
        }

        //Criar variáveis que armazenarão os numeros menor e maior
        double menor = numeros[0];
        double maior = numeros[0];

        //Mostrar os números inseridos
        System.out.println("Os números digitados foram: ");
        for (int i = 0; i < 10; i++){
            System.out.println(numeros[i] + " ");
        }
            
        // Verificar qual numero é o menor e qual é o maior

        // Começa do segundo número (i = 1) já que usamos o primeiro para inicializar e ele ja será verificado
        for (int i = 1; i < 10; i++) { 
            if (numeros[i] < menor) {

                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i]; // Atualiza o maior número se encontrar um número maior
            }
        }

        // Mostrar o menor e o maior número
        System.out.println("O menor número inserido é: " + menor);
        System.out.println("O maior número inserido é: " + maior);

        //Fechar
        scanner.close();
    }
    
}
