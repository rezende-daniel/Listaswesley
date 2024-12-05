import java.util.Scanner;

class Circulo {
    int x, y;
    double raio; 


    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }


    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }


    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }


    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }


    public void moveX(int x1) {
        this.x += x1;
    }


    public void moveY(int y1) {
        this.y += y1;
    }


    public void aumenta(double n) {
        this.raio *= n;
    }


    public void exibe() {
        System.out.println("Centro: (" + x + ", " + y + ")");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}

public class TesteCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Informe as coordenadas (x, y) do círculo:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        System.out.print("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();


        Circulo circulo = new Circulo(x, y, raio);

        int opcao;
        do {

            System.out.println("\nMenu:");
            System.out.println("1 - Mover");
            System.out.println("2 - Aumentar");
            System.out.println("3 - Imprimir");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
      
                    System.out.print("Informe a distância para mover no eixo X: ");
                    int dx = scanner.nextInt();
                    circulo.moveX(dx);
                    System.out.print("Informe a distância para mover no eixo Y: ");
                    int dy = scanner.nextInt();
                    circulo.moveY(dy);
                    break;

                case 2:
     
                    System.out.print("Informe o fator para aumentar o raio: ");
                    double fator = scanner.nextDouble();
                    circulo.aumenta(fator);
                    break;

                case 3:
                
                    circulo.exibe();
                    break;

                case 4:
          
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
