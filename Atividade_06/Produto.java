import java.util.Scanner;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private static int ultimoId = 1; 
    
   
    public Produto() {
        this.id = ultimoId;
        ultimoId++;
        this.nome = "Nome não informado";
        this.preco = 0.0;
    }
    

    public Produto(String nome, double preco) {
        this(); 
        this.nome = nome;
        setPreco(preco);
    }
    
    
    public int getId() {
        return id;
    
    public String getNome() {
        return nome; 
    }
    
    public void setNome(String nome) {
        this.nome = nome; 
    }
    
    public double getPreco() {
        return preco; 
    }
    
    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0.0; 
        } else {
            this.preco = preco;
        }
    }
    
    public static int getUltimoId() {
        return ultimoId - 1;
    }
    
   
    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
    
    
    public void reajustaPreco(double percentual) {
        preco += preco * (percentual / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1, produto2;


        System.out.println("Informe o nome do primeiro produto: ");
        String nome1 = scanner.nextLine();
        System.out.println("Informe o preço do primeiro produto: ");
        double preco1 = scanner.nextDouble();
        scanner.nextLine(); 
        produto1 = new Produto(nome1, preco1);

        System.out.println("Informe o nome do segundo produto: ");
        String nome2 = scanner.nextLine();
        System.out.println("Informe o preço do segundo produto: ");
        double preco2 = scanner.nextDouble();
        scanner.nextLine(); 
        produto2 = new Produto(nome2, preco2);
        
        System.out.println("Informe o percentual de reajuste para os produtos: ");
        double percentual = scanner.nextDouble();
    
        produto1.reajustaPreco(percentual);
        produto2.reajustaPreco(percentual);
        
        
        System.out.println("\n--- Informações do Primeiro Produto ---");
        produto1.exibe();
        System.out.println("Último id gerado: " + Produto.getUltimoId());
        
        System.out.println("\n--- Informações do Segundo Produto ---");
        produto2.exibe();
        System.out.println("Último id gerado: " + Produto.getUltimoId());
        
        scanner.close();
    }
}
