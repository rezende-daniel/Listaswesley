import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite um comando Git (git clone, git fetch, git pull): ");
        String comando = scanner.nextLine();

        
        switch (comando) {
            case "git clone":
                System.out.println("Explicação: O comando git clone é usado para criar uma cópia de um repositório remoto.");
                System.out.println("Exemplo: git clone https://github.com/rezende-daniel/Listaswesley.git");
                break;
            case "git fetch":
                System.out.println("Explicação: O comando git fetch é usado para buscar as atualizações do repositório remoto sem integrar ao repositório local.");
                System.out.println("Exemplo: git fetch origin");
                break;
            case "git pull":
                System.out.println("Explicação: O comando git pull é usado para buscar e atualizar o repositório remoto ao repositório local.");
                System.out.println("Exemplo: git pull origin main");
                break;
            default:
                System.out.println("Comando inválido.");
                break;
        }
    }
}
