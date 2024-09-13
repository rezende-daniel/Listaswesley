
import javax.swing.JOptionPane;
class Exercicio1 {

    public static void main(String[] args) {
        

        //Entrada de dados

        int nota1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o primeiro número:"));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o segundo número:"));
        int nota3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o terceiro número:"));
        //Manipulação de dados
        float media = ((nota1 + nota2 + nota3)/3);
        JOptionPane.showMessageDialog(null,"A média aritimetca dos núemros é "+media);
        
        }
    }
