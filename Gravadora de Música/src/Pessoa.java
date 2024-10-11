public class Pessoa {
    private String nome;
    private String generoMusical;

    public Pessoa(String nome, String generoMusical) {
        this.nome = nome;
        this.generoMusical = generoMusical;
    }

    public String getNome() {
        return nome;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero Musical: " + generoMusical);
    }
}
