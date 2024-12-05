import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    
    private ArrayList<Pessoa> cadastro;

    public Cadastro() {
        cadastro = new ArrayList<Pessoa>();
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        cadastro.add(pessoa);
    }

    public void imprimirCadastro() {
        for (Pessoa pessoa : cadastro) {
            System.out.println("Nome: " + pessoa.getNome());
            if (pessoa instanceof PessoaFisica) {
                System.out.println("CPF: " + ((PessoaFisica) pessoa).getCPF());
            } else if (pessoa instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) pessoa).getCNPJ());
            }
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        
        while (true) {
            System.out.println("Escolha a opção:");
            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Imprimir Cadastro");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            if (opcao == 1) {
                PessoaFisica pessoaFisica = new PessoaFisica();
                System.out.print("Digite o nome da pessoa física: ");
                pessoaFisica.setNome(scanner.nextLine());
                System.out.print("Digite o CPF da pessoa física: ");
                pessoaFisica.setCPF(scanner.nextLine());
                cadastro.cadastrarPessoa(pessoaFisica);
            } else if (opcao == 2) {
                PessoaJuridica pessoaJuridica = new PessoaJuridica();
                System.out.print("Digite o nome da pessoa jurídica: ");
                pessoaJuridica.setNome(scanner.nextLine());
                System.out.print("Digite o CNPJ da pessoa jurídica: ");
                pessoaJuridica.setCNPJ(scanner.nextLine());
                cadastro.cadastrarPessoa(pessoaJuridica);
            } else if (opcao == 3) {
                cadastro.imprimirCadastro();
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        
        scanner.close();
    }
}
