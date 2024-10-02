import javax.swing.*;
public class Exercicio8 {
    public static void main(String[] args) {
        int entrada =Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o código do produto"));
        switch (entrada) {
            case 1:
                JOptionPane.showMessageDialog(null, "Sapato - R$99,99");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Bolsa - R$103,89");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Camisa - R$49,98");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Calça - R$89,72");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Blusa -R$97,35");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Não existe produto com este código");
                break;
        }
    }
}
