
import javax.swing.JOptionPane;


public class Exercicio04 {
    public static void main(String[] args) {
        
    
        

        Double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor do seu salario: "));
        
        

        double salarioNovo= salario*1.25;
        
        JOptionPane.showMessageDialog(null,"Seu noovo salrio é de "+salarioNovo+" reais");


    }
}