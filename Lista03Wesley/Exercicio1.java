

import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        int nota;
        int falta;
        int notaAlta=0;
        int reprovado=0;
        int maiorNota=0;
        int menorNota=0;
        double somaNota=0;
        int numeroAlunos=0;
        do{
            nota=Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a nota final do aluno:"));
            if(nota>=0){
            falta=Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o número de faltas do aluno:"));
            somaNota=somaNota+nota;
            numeroAlunos++;
            if(nota>90){
                notaAlta++;
            }
             if(nota<70 || falta>=20){
                reprovado++;
            } 
            if(nota>maiorNota){
                maiorNota=nota;
            } 
            if(nota<menorNota){
                menorNota=nota;
            } 
                somaNota=nota+somaNota;
                numeroAlunos++;
        }



            
        } while(nota>=0);
        JOptionPane.showMessageDialog(null,"O núemro de alunos que tiveram nota superior a 90 é "+notaAlta);
        JOptionPane.showMessageDialog(null, "o número de alunos reprovados por nota ou falta foi de "+reprovado);
        JOptionPane.showMessageDialog(null, "A maior nota da sala foi de "+maiorNota+" a menor nota foi de "+menorNota);
        JOptionPane.showMessageDialog(null, "A média de notas da turma foi de "+somaNota/numeroAlunos);

        
        
        

    }
}
