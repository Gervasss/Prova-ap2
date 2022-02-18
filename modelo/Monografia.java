package modelo;

public abstract class Monografia extends TrabalhoSupervisionado{
    
  private  String tema ;
private String palavrasChaves;



    public Monografia(int codigo,String titulo,String professor,String dataApresentacao,Aluno aluno,String tema, String palavrasChaves) {
        super(codigo, titulo, professor, dataApresentacao,aluno);
        this.tema = tema;
        this.palavrasChaves = palavrasChaves;
    }
    public Monografia(){}

    public String getTema(){ 
        return this.tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getPalavrasChaves() {
        return this.palavrasChaves;
    }

    public void setPalavrasChaves(String palavrasChaves) {
        this.palavrasChaves = palavrasChaves;
    }
 
    public double CalcularNota(double nt1,double nt2,double nt3){
        return(nt1+nt2+nt3)/3;
         
    }
    @Override
    public String  imprimirTrab(){
        String imprimir="monografia:"+ 
                         "nome:"+this.getAluno()+
                        "\ncodigo:"+ this.getCodigo()+
                        "\ntema:"+this.getTema()+
                         "\ntitulo:"+this.getTitulo()+
                         "\nprofessor:"+this.getProfessor()+
                        "\npalavras chaves:"+this.getPalavrasChaves()+
                        "\ndata de apresentaçao:"+this.getDataApresentacao();
                    return imprimir;
                    }
                    
                        
    }
    
    

    
    




    

