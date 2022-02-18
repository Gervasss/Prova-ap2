package modelo;

public  abstract class  TrabalhoSupervisionado  {
    private int codigo,iden=0;
    private String titulo;
    private String professor;
    private String dataApresentacao;
    private Aluno aluno;







    public TrabalhoSupervisionado(){}
    public TrabalhoSupervisionado(int codigo, String titulo, String professor, String dataApresentacao,Aluno aluno) {
        this.codigo = mexCodigo();
        this.titulo = titulo;
        this.professor = professor;
        this.dataApresentacao = dataApresentacao;
        this.aluno=aluno;}

    public int getIden() {
        return this.iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int mexCodigo() {
        return iden++;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProfessor() {
        return this.professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDataApresentacao() {
        return this.dataApresentacao;
    }

    public void setDataApresentacao(String dataApresentacao) {
        this.dataApresentacao = dataApresentacao;
    }

public abstract double CalcularNota();
public abstract  String imprimirTrab();
public abstract String imprimirAlu();

    

}
