import javax.swing.*;

public class Exercicio06 {
    public static void main(String[] args) {
        
        double celsius;
        double fahrenheit;
        

        
        celsius = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a temperatura em celsius: "));
       
        

        fahrenheit= (celsius*1.8)+32;
        
        JOptionPane.showMessageDialog(null, "Está "+fahrenheit+" graus fahrenheit");


    }
}
