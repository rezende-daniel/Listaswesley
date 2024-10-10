import javax.swing.JOptionPane;

public class Questao2A {
    public static void main(String[] args) {
        String entrada;
        entrada = JOptionPane.showInputDialog("Informe o número da conta (3 dígitos):");

        // Verifica se a entrada tem 3 dígitos
        if (entrada.length() != 3 || !entrada.matches("\\d{3}")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido de 3 dígitos.");
            return;
        }

        // Converte a entrada para inteiro
        int conta = Integer.parseInt(entrada);
        int contaInvertida = inverterNumero(conta);

        // Soma os números
        int soma = conta + contaInvertida;

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "A soma de " + conta + " e " + contaInvertida + " é: " + soma);
    }

    private static int inverterNumero(int numero) {
        String numStr = String.valueOf(numero);
        String numInvertido = new StringBuilder(numStr).reverse().toString();
        return Integer.parseInt(numInvertido);
    }
}
