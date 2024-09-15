

import javax.swing.*;

public class Exercicio05 {
    public static void main(String[] args) {
        
        double  diagonalMaior;
        double diagonalMenor;
        

        
        diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a diagonal maior:"));
        
        diagonalMenor= Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a diagonal menor:"));
        

        double area= (diagonalMaior*diagonalMenor)/2;
        JOptionPane.showMessageDialog (null,"O losango possue "+area+" U.A.");



    }
}