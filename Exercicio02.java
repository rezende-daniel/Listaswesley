
import javax.swing.JOptionPane;
class Exercicio2 {

    public static void main(String[] args) {
        
        int anoAtual;
        int anoNascimento;
        int anoDoUsuario;

        
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o ano atual: "));
        
        anoNascimento= Integer.parseInt(JOptionPane.showInputDialog(null,"Insira seu ano de nascimento: "));
        
        

        int idade= anoAtual-anoNascimento;
        
        JOptionPane.showMessageDialog(null,"Você tem "+idade+" anos");
        int idade2050= 2050-anoNascimento;
       
        JOptionPane.showMessageDialog(null,"Você tera "+idade2050+" anos em 2050");

    }
}
