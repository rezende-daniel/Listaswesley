import javax.swing.*;
 

public class Exercicio9 {

    public static void vt (double v0,double gravidade,int t){
            double vt= v0-gravidade*t;
            JOptionPane.showMessageDialog(null, "A velocidade é de "+vt+" m/s");
    }
    public static void ht (double v0,int t,double gravidade){
        double ht = v0*t-((gravidade*Math.pow(v0,2))/2);
        JOptionPane.showMessageDialog(null,"A altura da bola sera de "+ht+" metros");
    }
    public static void main(String[] args) {
        
        double mercurio = 3.7;
        double venus = 8.8;
        
        double terra = 9.8;
        double marte = 3.8;
        double jupter = 26.4;
        double saturno= 11.5;
        double urano =9.3;
        double netuno = 12.2;
        double plutao = 0.6;
        int planeta;
        double v0;
        planeta=Integer.parseInt( JOptionPane.showInputDialog(null,"Insira um número para o planeta: \n 1-Mercúrio \n 2-Vênus \n 3-Terra \n 4-Marte \n 5-Júpter \n 6-Saturno \n 7-Urano \n 8-Netuno \n 9-Plutão"));
        v0 = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a V0 em m/s"));
        int t =Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o instante T em segundos"));

        switch (planeta){
            case 1:
             vt(v0,mercurio,t);
             ht(v0,t,mercurio);
             break;
             case 2:
             vt(v0,venus,t);
             ht(v0,t,venus);
             break;
             case 3:
             vt(v0,terra,t);
             ht(v0,t,terra);
             break;
             case 4:
             vt(v0,marte,t);
             ht(v0,t,marte);
             break;
             case 5:
             vt(v0,jupter,t);
             ht(v0,t,jupter);
             break;
             case 6:
             vt(v0,saturno,t);
             ht(v0,t,saturno);
             break;
             case 7:
             vt(v0,urano,t);
             ht(v0,t,urano);
             break;
             case 8:
             vt(v0,netuno,t);
             ht(v0,t,netuno);
             break;
             case 9:
             vt(v0,plutao,t);
             ht(v0,t,plutao);
             break;
        }
        
    }
}
