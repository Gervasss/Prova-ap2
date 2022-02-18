package visao;
 import java.util.Scanner;
 import controle.*;
import modelo.TrabalhoSupervisionado;

import javax.swing.JOptionPane;

 public class EmpregadoApp{
public static String menu() {
    return  "[1] Cadastrar Aluno\n" + 
                "[2] Cadastrar trabalho supervisionado\n" +
                "[3] imprimir trabalho cadastrado\n" +
                "[0] Sair do Programa\n"; 
    
}

public static void main(String[]args){
    ControleTrabalhoSupervisionado cts=new ControleTrabalhoSupervisionado();
    ControleAluno cta=new ControleAluno();
    int ai=10;


    while(ai != 0){
        switch(ai){
            case 1:
            String nome=JOptionPane.showInputDialog("digite o nome do aluno:");
            long matricula = Long.parseLong(JOptionPane.showInputDialog("digite o numero de matricula do aluno:"));
            cta.cadastrarAlu(nome, matricula);
            JOptionPane.showMessageDialog(null,"Aluno cadastrado com sucesso");
              break;
            case 2:
            int codigo=Integer.parseInt(JOptionPane.showInputDialog("digite o codigo de trabalho:"));
            String titulo =JOptionPane.showInputDialog("digite o titulo do trabalho:");
            String professor =JOptionPane.showInputDialog("digite o nome do professor:");
            String dataApresentacao=JOptionPane.showInputDialog("digite o dia da apresentacao:");
            String aluno=JOptionPane.showInputDialog("insira o nome do aluno:");
            cts.cadastrarTrab(codigo,titulo, professor, dataApresentacao,aluno);
            JOptionPane.showMessageDialog(null,"trabalho supervisionado cadastrado com sucesso:");
            break;
            case 3:
            JOptionPane.showMessageDialog(null, TrabalhoSupervisionado.imprimirTrab());
            break;

        }
    }
}

 }

