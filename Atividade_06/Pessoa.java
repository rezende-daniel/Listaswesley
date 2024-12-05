import java.util.Scanner;

class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class PessoaFisica extends Pessoa {
    private String CPF;

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }
}

class PessoaJuridica extends Pessoa {
    private String CNPJ;

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }
}

class Cadastro {
    private Pessoa[] cadastro;
    private int indice;

    public Cadastro(int tamanho) {
        cadastro = new Pessoa[tamanho];
        indice = 0;
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        if (indice < cadastro.length) {
            cadastro[indice] = pessoa;
            indice++;
        } else {
            System.out.println("Cadastro cheio! Não é possível cadastrar mais pessoas.");
        }
    }

    public void imprimirCadastro() {
        System.out.println("\nCadastro:");
        for (int i = 0; i < indice; i++) {
            Pessoa pessoa = cadastro[i];
            System.out.print("Nome: " + pessoa.getNome());
            if (pessoa instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) pessoa;
                System.out.println(", CPF: " + pf.getCPF());
            } else if (pessoa instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) pessoa;
                System.out.println(", CNPJ: " + pj.getCNPJ());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro(5); 

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 – Cadastrar Pessoa Física.");
            System.out.println("2 – Cadastrar Pessoa Jurídica.");
            System.out.println("3 – Imprimir Cadastro.");
            System.out.println("4 – Sair.");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    PessoaFisica pf = new PessoaFisica();
                    System.out.print("Informe o nome da Pessoa Física: ");
                    pf.setNome(scanner.nextLine());
                    System.out.print("Informe o CPF da Pessoa Física: ");
                    pf.setCPF(scanner.nextLine());
                    cadastro.cadastrarPessoa(pf);
                    break;

                case 2:
                    PessoaJuridica pj = new PessoaJuridica();
                    System.out.print("Informe o nome da Pessoa Jurídica: ");
                    pj.setNome(scanner.nextLine());
                    System.out.print("Informe o CNPJ da Pessoa Jurídica: ");
                    pj.setCNPJ(scanner.nextLine());
                    cadastro.cadastrarPessoa(pj);
                    break;

                case 3:
                    cadastro.imprimirCadastro();
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
