import javax.swing.*;

class Exercicio1{
    public static void main(String[] args) {
        int nota1=Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a primeira nota:"));
        int nota2=Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a segunda nota:"));
        int media=(nota1+nota2)/2;

        if (media<7){
            JOptionPane.showMessageDialog(null, "REPROVADO");
            
        }
        else{
            JOptionPane.showMessageDialog(null,"APROVADO");
        }
    }
}