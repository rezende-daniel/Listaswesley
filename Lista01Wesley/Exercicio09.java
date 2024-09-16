import javax.swing.*;

public class Exercicio09 {
    public static void main(String[] args) {
        
        
        

        
        double cateto1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o primiero cateto"));
         
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o segundo cateto"));


        double hipo = Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2,2));
        

        JOptionPane.showMessageDialog(null,"A hipotenusa vale "+hipo);
        

    }
}

