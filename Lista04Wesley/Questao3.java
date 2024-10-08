import javax.swing.JOptionPane;

public class Questao3 {
    public static void main(String[] args) {
        double nota = lerNota();
        double salario = lerSalario();
        char sexo = lerSexo();
        int idade = lerIdade();

        // Exibe os dados validados
        JOptionPane.showMessageDialog(null, "Dados validados:\n" +
                "Nota: " + nota + "\n" +
                "Salário: " + salario + "\n" +
                "Sexo: " + sexo + "\n" +
                "Idade: " + idade);
    }

    private static double lerNota() {
        double nota;
        while (true) {
            String entrada = JOptionPane.showInputDialog("Informe a nota (entre 0 e 10):");
            try {
                nota = Double.parseDouble(entrada);
                if (nota >= 0 && nota <= 10) {
                    return nota;
                } else {
                    JOptionPane.showMessageDialog(null, "Nota inválida! Deve estar entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, insira um número.");
            }
        }
    }

    private static double lerSalario() {
        double salario;
        while (true) {
            String entrada = JOptionPane.showInputDialog("Informe o salário (maior que zero):");
            try {
                salario = Double.parseDouble(entrada);
                if (salario > 0) {
                    return salario;
                } else {
                    JOptionPane.showMessageDialog(null, "Salário inválido! Deve ser maior que zero.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, insira um número.");
            }
        }
    }

    private static char lerSexo() {
        char sexo;
        while (true) {
            String entrada = JOptionPane.showInputDialog("Informe o sexo (m ou f):");
            sexo = entrada.toLowerCase().charAt(0);
            if (sexo == 'm' || sexo == 'f') {
                return sexo;
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido! Deve ser 'm' ou 'f'.");
            }
        }
    }

    private static int lerIdade() {
        int idade;
        while (true) {
            String entrada = JOptionPane.showInputDialog("Informe a idade (entre 0 e 120):");
            try {
                idade = Integer.parseInt(entrada);
                if (idade >= 0 && idade <= 120) {
                    return idade;
                } else {
                    JOptionPane.showMessageDialog(null, "Idade inválida! Deve estar entre 0 e 120.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, insira um número.");
            }
        }
    }
}
