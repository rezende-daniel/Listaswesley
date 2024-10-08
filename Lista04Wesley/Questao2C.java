import javax.swing.JOptionPane;

public class Questao2C {
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

        // Exibe a soma
        JOptionPane.showMessageDialog(null, "A soma de " + conta + " e " + contaInvertida + " é: " + soma);

        // Calcula a soma das multiplicações dos dígitos
        int resultadoMultiplicacao = calcularMultiplicacao(soma);

        // Exibe o resultado da multiplicação
        JOptionPane.showMessageDialog(null, "A soma das multiplicações é: " + resultadoMultiplicacao);
    }

    private static int inverterNumero(int numero) {
        String numStr = String.valueOf(numero);
        String numInvertido = new StringBuilder(numStr).reverse().toString();
        return Integer.parseInt(numInvertido);
    }

    private static int calcularMultiplicacao(int soma) {
        String somaStr = String.valueOf(soma);
        int somaTotal = 0;

        // Multiplica cada dígito pelo seu índice e soma
        for (int i = 0; i < somaStr.length(); i++) {
            int digito = Character.getNumericValue(somaStr.charAt(i));
            somaTotal += digito * i; // Multiplica pelo índice
        }

        return somaTotal; // Retorna a soma total das multiplicações
    }
}
