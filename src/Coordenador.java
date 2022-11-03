public class Coordenador extends Pessoa{
    int qntdCursosCoord;


    public Coordenador(String nome, int idade, int qntdCursosCoord) {
        super(nome, idade);
        this.qntdCursosCoord = qntdCursosCoord;
    }

    public int getQntdCursosCoord() {
        return qntdCursosCoord;
    }

    public void setQntdCursosCoord(int qntdCursosCoord) {
        this.qntdCursosCoord = qntdCursosCoord;
    }

    @Override
    public void obterInformacoes() {
        super.obterInformacoes();
        System.out.println("Quantidade de crusos: " + this.qntdCursosCoord);
    }
}
