import javax.swing.*;

public class Exercicio07 {
    public static void main(String[] args) {
        
        double valorSalarioMinimo;
        double salario;
        

        
        valorSalarioMinimo = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor do salário mínimo: "));
        
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o salario do funcionario: "));
       
        

        double numeroDeSalarios = salario/valorSalarioMinimo;

        JOptionPane.showMessageDialog(null,"O funcionario recebe " +numeroDeSalarios+" salarios" );


    }
}