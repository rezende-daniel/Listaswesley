import javax.swing.*;
public class Exercicio4 {
    public static void main(String[] args) {
        double peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o peso em quilos"));
        double altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a altura em metros"));

        double imc=peso/(Math.pow(altura,2));
        if(imc<20){
            JOptionPane.showMessageDialog(null,"Abaixo do peso");
        } else if(imc<25){
            JOptionPane.showMessageDialog(null,"Normal");
        }
            else if(imc<30){
                JOptionPane.showMessageDialog(null, "Sobrepeso");
        }   else if(imc<40){
            JOptionPane.showMessageDialog(null,"Obesidade");
    
       } else{
        JOptionPane.showMessageDialog(null,"Obesidae Mórbida");
       }

    }
}
