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
        } else{
            JOptionPane.showMessageDialog(null,"Esta é uma equação de segundo grau");
            double delta =Math.pow(termoB,2)-4*termoA*termoC;
            if (delta<0){
                JOptionPane.showMessageDialog(null, "Esta equação não possui raizes reais");
            } else if(delta==0){
                JOptionPane.showMessageDialog(null, "Esta equação possui duas raízes iguais");
                JOptionPane.showMessageDialog(null,(termoB*-1)/(2*termoA) );
            } else {
                double raiz1 =(-termoB+Math.sqrt(delta))/2*termoA;
                double raiz2 =(-termoB-Math.sqrt(delta))/2*termoA;
                JOptionPane.showMessageDialog(null, "Esta equação possue duas raízes reais diferentes");
                JOptionPane.showMessageDialog(null, raiz1+" e "+raiz2);
            }
        }
    }
}
