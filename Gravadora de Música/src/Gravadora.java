import java.util.ArrayList;
import java.util.List;

public class Gravadora {
    private String nome;
    private List<Artista> artistas;
    private List<Produtor> produtores;
    private List<Album> albuns;

    public Gravadora(String nome) {
        this.nome = nome;
        this.artistas = new ArrayList<>();
        this.produtores = new ArrayList<>();
        this.albuns = new ArrayList<>();
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }

    public void adicionarProdutor(Produtor produtor) {
        produtores.add(produtor);
    }

    public void adicionarAlbum(Album album) {
        albuns.add(album);
    }

    public void exibirArtistas() {
        System.out.println("Artistas da Gravadora " + nome + ":");
        for (Artista artista : artistas) {
            artista.exibirInformacoes();
            System.out.println("-------------------------");
        }
    }

    public void exibirProdutores() {
        System.out.println("Produtores da Gravadora " + nome + ":");
        for (Produtor produtor : produtores) {
            produtor.exibirInformacoes();
            System.out.println("-------------------------");
        }
    }

    public void exibirAlbuns() {
        System.out.println("Álbuns da Gravadora " + nome + ":");
        for (Album album : albuns) {
            album.exibirInformacoesAlbum();
            System.out.println("-------------------------");
        }
    }
}
