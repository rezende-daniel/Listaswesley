import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        double nota1=Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a primeira nota"));
        double nota2=Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a segunda nota"));
        double nota3=Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a terceira nota"));

        double media=(nota1+nota2+nota3)/3;
        if(media>=0 && media<3){
            JOptionPane.showMessageDialog(null,"REPROVADO");
        }else if(media>=3&&media<7){
            JOptionPane.showMessageDialog(null,"EXAME");
        }else {
            JOptionPane.showMessageDialog(null,"APROVADO");
        }
    }
}
