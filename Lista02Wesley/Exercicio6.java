import javax.swing.*;

public class Exercicio6 {
    public static void main(String[] args) {
        int lado1 =Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o primeiro lado"));
        int lado2 =Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o segundo lado"));
        int lado3 =Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o terceiro lado"));
        boolean confere1= (Math.abs(lado2-lado3)<lado1 && lado1<(lado2+lado3));
        boolean confere2= (Math.abs(lado1-lado3)<lado2 && lado2<(lado1+lado3));
        boolean confere3= (Math.abs(lado1-lado2)<lado3 && lado3<(lado1+lado2));

        if(confere1==confere2==confere3==true){
            JOptionPane.showMessageDialog(null,"Os lados informados podem compor um triangulo");
        } else{
            JOptionPane.showMessageDialog(null,"Os lados informados não podem compor um triangulo");
        }
    }
}
