import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            // Solicita a matrícula do aluno
            System.out.print("Informe a matrícula do aluno (número negativo para encerrar): ");
            int matricula = input.nextInt();
            
            if (matricula < 0) {
                break; // Encerra o loop se a matrícula for negativa
            }
            
            // Solicita as três notas do aluno
            System.out.print("Informe a primeira nota: ");
            double nota1 = input.nextDouble();
            System.out.print("Informe a segunda nota: ");
            double nota2 = input.nextDouble();
            System.out.print("Informe a terceira nota: ");
            double nota3 = input.nextDouble();
            
            // Calcula a média das três notas
            double media = (nota1 + nota2 + nota3) / 3;
            
            // Exibe o resultado com base na média
            if (media >= 70) {
                System.out.println("Aluno de matrícula " + matricula + " foi APROVADO com média " + media);
            } else if (media >= 60) {
                System.out.println("Aluno de matrícula " + matricula + " está em RECUPERAÇÃO com média " + media);
            } else {
                System.out.println("Aluno de matrícula " + matricula + " foi REPROVADO com média " + media);
            }
            
            System.out.println(); // Linha em branco para separar as informações de cada aluno
        }
        
        input.close();
        System.out.println("Programa encerrado.");
    }
}
