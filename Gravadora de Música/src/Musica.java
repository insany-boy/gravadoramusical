public class Musica {
    private String titulo;
    private String duracao;

    public Musica(String titulo, String duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void tocarMusica() {
        System.out.println("Tocando a música: " + titulo + " [" + duracao + "]");
    }
}
