import javax.swing.*;

public class Exercicio7 {
    public static void main(String[] args) {
        double termoA= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o primeiro termo da equação:"));
        double termoB= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o segundo termo da equação:"));
        double termoC= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o terceiro termo da equação:"));
        
        if(termoA==0 && termoB==0 && termoC==0){
            JOptionPane.showMessageDialog(null, "Igualdade confirmada: 0 = 0");
        } else if(termoA==0 && termoB==0){
            JOptionPane.showMessageDialog(null,"Coeficientes informados incorretamente");
        } else if(termoA==0){
            double raiz = (-1*termoC)/termoB;
            JOptionPane.showMessageDialog(null,"Esta é uma equação de primeiro grau com raiz igual a "+raiz);
        }
    }
}
