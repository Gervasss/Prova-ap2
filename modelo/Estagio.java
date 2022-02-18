package modelo;



public abstract class Estagio extends TrabalhoSupervisionado {
   private String empresa;
   private String turno;
   int cargaHoraria;
   
   
public Estagio(int codigo, String titulo, String professor,String dataApresentacao,Aluno aluno,String empresa){
    super( codigo,titulo, professor, dataApresentacao,aluno);
    this.empresa=empresa;
}

public Estagio(int codigo, String titulo, String professor, String dataApresentacao,Aluno aluno,String empresa, String turno, int cargaHoraria) {
    super(codigo, titulo, professor, dataApresentacao,aluno);
    this.empresa = empresa;
    this.turno = turno;
    this.cargaHoraria = cargaHoraria;
}

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public double CalcularNota(double NotaP,double NotaS){
        return ((NotaS *6) + (NotaP*4))/10;
    }
@Override
 public String imprimirAlu(){
     String imprimir="Estagio:"+
                      "nome :"+this.getAluno()+
                      "\ncodigo:"+this.getCodigo()+
                      "\ntitulo:"+this.getTitulo()+
                      "\nturno:"+this.getTurno()+
                      "\nempresa:"+this.getEmpresa()+
                      "\ncarga horaria:"+this.getCargaHoraria();
                      return imprimir;
 }
 
    
}


   


