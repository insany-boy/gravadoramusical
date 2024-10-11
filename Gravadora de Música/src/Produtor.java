public class Produtor extends Pessoa {
    private int anosExperiencia;

    public Produtor(String nome, String generoMusical, int anosExperiencia) {
        super(nome, generoMusical);
        this.anosExperiencia = anosExperiencia;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void produzirMusica() {
        System.out.println(getNome() + " está produzindo uma música.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Anos de Experiência: " + anosExperiencia);
    }
}
