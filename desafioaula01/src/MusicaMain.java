public class MusicaMain {

  static void main(String[] args) {

    Musica musica = new Musica();
    musica.titulo = "Sinonimo";
    musica.artista = "Zé Ramalho";

    musica.exibirFichaTecnica();

    musica.avaliar(8);
    musica.avaliar(7);
    musica.mediaAvaliacoes();


  }



}
