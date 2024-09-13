import javax.swing.JOptionPane;


public class Exercicio03 {
    public static void main(String[] args) {
       
        double cotacaoDolar;
        double dolares;
        

        
        cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a cotação do dolar em real:"));
       
        dolares= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a quantidade de dolares que você possue:"));
        

        double real= dolares*cotacaoDolar;
        
        JOptionPane.showMessageDialog(null,"Você possue "+real+" reais" );



    }
}