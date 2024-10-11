public class Artista extends Pessoa {
    private int numeroAlbunsLancados;

    public Artista(String nome, String generoMusical, int numeroAlbunsLancados) {
        super(nome, generoMusical);
        this.numeroAlbunsLancados = numeroAlbunsLancados;
    }

    public int getNumeroAlbunsLancados() {
        return numeroAlbunsLancados;
    }

    public void gravarMusica() {
        System.out.println(getNome() + " está gravando uma nova música.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.err.println("Número de Álbuns Lançados: " + numeroAlbunsLancados);
    }
}
