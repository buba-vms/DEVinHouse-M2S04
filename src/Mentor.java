public class Mentor extends Pessoa {
    String linguagemDeProgramacao;


    public Mentor(String nome, int idade, String linguagemDeProgramacao) {
        super(nome, idade);
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    public String getLinguagemDeProgramacao() {
        return linguagemDeProgramacao;
    }

    public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    @Override
    public void obterInformacoes() {
        super.obterInformacoes();
        System.out.println("Linguagem de Programação: " + this.linguagemDeProgramacao);
    }
}
