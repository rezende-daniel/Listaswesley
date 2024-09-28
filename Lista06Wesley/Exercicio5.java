import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {
        double num=Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor para usar nas funções"));
        if(num<-2){
            num =2*num +2;
            JOptionPane.showMessageDialog(null,"O resultado foi "+num);
        }else if(num<3){
            JOptionPane.showMessageDialog(null,"O resultado foi 3");
        } else {
            num=num*-1;
            JOptionPane.showMessageDialog(null,"O resultado foi "+num);
        }
    }
    
}
