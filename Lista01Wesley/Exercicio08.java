import javax.swing.*;

public class Exercicio08 {
    public static void main(String[] args) {
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o peso: "));
       
        

        double pesoMais = peso*1.15;
        double pesoMenos = peso*0.8;

        JOptionPane.showMessageDialog(null,"Se a pessoa engordar 15% ela tera " +pesoMais+" quilos" );
        JOptionPane.showMessageDialog(null,"Se a pessoa emagrecer 20% ela tera "+pesoMenos+" quilos");

    }
}