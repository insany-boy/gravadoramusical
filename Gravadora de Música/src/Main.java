public class Main {
    public static void main(String[] args) throws Exception {
        Gravadora sonyMusic = new Gravadora("Sony Music");

        Artista artista1 = new Artista("Jorge & Matheus", "Sertanejo", 10);
        Artista artista2 = new Artista("Anitta", "Pop", 5);
        Artista artista3 = new Artista("Harry Styles", "Pop", 3);

        Produtor produtor1 = new Produtor("Dj Alok", "Eletrônica", 15);
        Produtor produtor2 = new Produtor("Rick Bonadio", "Pop/Rock", 20);
        Produtor produtor3 = new Produtor("Jeff Bhasker", "Pop", 20);

        Album album1 = new Album("Terra sem CEP", 2018);
        Musica musica1 = new Musica("Propaganda", "3:15");
        Musica musica2 = new Musica("Coração Calejado", "3:45");

        Album album2 = new Album("Kisses", 2019);
        Musica musica3 = new Musica("Banana", "2:56");
        Musica musica4 = new Musica("Poquito", "2:40");

        Album album3 = new Album("Harry Styles", 2017);
        Musica musica5 = new Musica("Sign of the Times", "5:40");
        Musica musica6 = new Musica("Carolina", "3:10");

        album1.adicionarMusica(musica1);
        album1.adicionarMusica(musica2);

        album2.adicionarMusica(musica3);
        album2.adicionarMusica(musica4);

        album3.adicionarMusica(musica5);
        album3.adicionarMusica(musica6);
        
        sonyMusic.adicionarArtista(artista1);
        sonyMusic.adicionarArtista(artista2);
        sonyMusic.adicionarArtista(artista3);

        sonyMusic.adicionarProdutor(produtor1);
        sonyMusic.adicionarProdutor(produtor2);
        sonyMusic.adicionarProdutor(produtor3);

        sonyMusic.adicionarAlbum(album1);
        sonyMusic.adicionarAlbum(album2);
        sonyMusic.adicionarAlbum(album3);

        sonyMusic.exibirArtistas();
        sonyMusic.exibirProdutores();
        sonyMusic.exibirAlbuns();

        artista1.gravarMusica();
        produtor1.produzirMusica();

    }
}
