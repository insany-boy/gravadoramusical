import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private int anoLancamento;
    private List<Musica> musicas;

    public Album(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void exibirInformacoesAlbum() {
        System.out.println("Álbum: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Músicas:");
        for (Musica musica: musicas) {
            System.out.println("- " + musica.getTitulo() + "[" + musica.getDuracao() + "]");
        }
    }
}
