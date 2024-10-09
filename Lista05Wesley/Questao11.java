import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorMasculinos = 0;
        int contadorFemininos = 0;
        int quantidade = 10; 

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Pessoa " + i + " - Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Pessoa " + i + " - Digite o peso (kg): ");
            double peso = scanner.nextDouble();

            if (sexo == 'M' || sexo == 'm') {
                if (peso >= 60 && peso <= 80) {
                    contadorMasculinos++;
                }
            }
            else if (sexo == 'F' || sexo == 'f') {
                if (peso >= 50 && peso <= 70) {
                    contadorFemininos++; 
                }
            }
        }

        System.out.println("Número de homens com peso entre 60 e 80 kg: " + contadorMasculinos);
        System.out.println("Número de mulheres com peso entre 50 e 70 kg: " + contadorFemininos);

        scanner.close();
    }
}
