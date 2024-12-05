pac
import java.util.Scanner;

public class Inteiro {

    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a; 
        }
        return resultado;
    }


    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a); 
        }
        return resultado;
    }

    
    public int divisao(int a, int b) {
        int quociente = 0;
        while (a >= b) {
            a -= b; 
            quociente++;
        }
        return quociente;
    }

    public int resto(int a, int b) {
        while (a >= b) {
            a -= b; 
        }
        return a;

    public boolean par(int a) {
        return resto(a, 2) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inteiro inteiro = new Inteiro();
        int opcao, a, b;

        do {
            // Exibe o menu para o usuário
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 – Multiplicação.");
            System.out.println("2 – Potência.");
            System.out.println("3 – Divisão.");
            System.out.println("4 – Par.");
            System.out.println("5 – Sair.");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o primeiro número (a): ");
                    a = scanner.nextInt();
                    System.out.print("Informe o segundo número (b): ");
                    b = scanner.nextInt();
                    System.out.println("Resultado da multiplicação: " + inteiro.multiplicacao(a, b));
                    break;

                case 2:
                    System.out.print("Informe a base (a): ");
                    a = scanner.nextInt();
                    System.out.print("Informe o expoente (b): ");
                    b = scanner.nextInt();
                    System.out.println("Resultado da potência: " + inteiro.potencia(a, b));
                    break;

                case 3:
                    System.out.print("Informe o dividendo (a): ");
                    a = scanner.nextInt();
                    System.out.print("Informe o divisor (b): ");
                    b = scanner.nextInt();
                    if (b == 0) {
                        System.out.println("Erro: Divisão por zero não permitida.");
                    } else {
                        System.out.println("Resultado da divisão: " + inteiro.divisao(a, b));
                    }
                    break;

                case 4:
                    System.out.print("Informe o número (a): ");
                    a = scanner.nextInt();
                    if (inteiro.par(a)) {
                        System.out.println(a + " é um número par.");
                    } else {
                        System.out.println(a + " é um número ímpar.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
