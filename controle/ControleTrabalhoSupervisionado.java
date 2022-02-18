package controle;
import modelo.*;
import java.util.ArrayList;

public class ControleTrabalhoSupervisionado {

    ArrayList <TrabalhoSupervisionado> trabson = new  ArrayList<>();



    public void cadastrarTrab(TrabalhoSupervisionado Trab){
        trabson.add( Trab);
            
    }


    public  TrabalhoSupervisionado pesquisarTrab(int codigo){
    for(int i = 0; i< trabson.size(); i++){
        if( trabson.get(i).getCodigo()==codigo){
            return trabson.get(i);
        }
      } return null;
    }
    

    public String  imprimirTrab(int codigo){
           String imprimir="";
           for(int i=0;i<trabson.size();i++){
               if(codigo==trabson.get(i).getCodigo()){
                   imprimir = trabson.get(i).toString();
               }
              
            }
            return imprimir;
        }
    }

    

