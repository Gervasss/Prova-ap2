package controle;
import java.util.ArrayList;
import modelo.*;

public class ControleAluno {

    ArrayList <Aluno> ninja = new  ArrayList<>();

    public void cadastrarAlu(String nome, long matricula ){
       ninja.add(new Aluno(nome,matricula));
            

    }

    public Aluno  pesquisaAlu(String nome){
        for(int i=0; i<ninja.size();i++){
            if(ninja.get(i).getNome() == nome ){
                return ninja.get(i);
            }

        }
        return null;
      }
}
    
    

    



