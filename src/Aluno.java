public class Aluno extends Pessoa {
    String curso;
    String matricula;


    public Aluno(String nome, int idade, String curso, String matricula) {
        super(nome, idade);
        this.curso = curso ;
        this. matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void obterInformacoes() {
        super.obterInformacoes();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
    }
}
