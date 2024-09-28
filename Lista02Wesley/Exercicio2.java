import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {
        double lado1=Double.parseDouble(JOptionPane.showInputDialog(null,"Isnira o primeiro lado"));
        double lado2=Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o segundo lado"));
        double lado3=Double.parseDouble(JOptionPane.showInputDialog(null,"InSira o terceiro lado"));

        if(lado1 ==lado2 && lado2==lado3){
            JOptionPane.showMessageDialog(null,"Triangulo equilatero");
        }
        else if(lado1==lado2|| lado1==lado3|| lado2==lado3){
            JOptionPane.showMessageDialog(null, "Triangulo isóceles");
        }
        else{
            JOptionPane.showMessageDialog(null,"Triangulo escaleno");
        }
    }
}
