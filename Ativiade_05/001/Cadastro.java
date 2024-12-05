import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    private ArrayList<Veiculo> cadastro;

    public Cadastro() {
        cadastro = new ArrayList<>();
    }

    public void cadastrarVeiculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do veículo:");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo do veículo:");
        String modelo = scanner.nextLine();

        System.out.println("Digite o número do chassi do veículo:");
        String numeroChassi = scanner.nextLine();

        System.out.println("Digite a placa do veículo:");
        String placa = scanner.nextLine();

        System.out.println("Digite a cor do veículo:");
        String cor = scanner.nextLine();

        Veiculo veiculo = new Veiculo(marca, modelo, numeroChassi, placa, cor);
        cadastro.add(veiculo);

        System.out.println("Veículo cadastrado com sucesso!");
    }

    public void imprimirCadastro() {
        if (cadastro.isEmpty()) {
            System.out.println("Não há veículos cadastrados.");
        } else {
            System.out.println("\nLista de veículos cadastrados:");
            for (Veiculo veiculo : cadastro) {
                System.out.println(veiculo);
            }
        }
    }

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n1. Cadastrar veículo");
            System.out.println("2. Imprimir cadastro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastro.cadastrarVeiculo();
                    break;
                case 2:
                    cadastro.imprimirCadastro();
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
