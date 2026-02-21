public class Musica {

  String titulo;
  String artista;
  int anoLancamento;
  double avaliacao;
  int numAvaliacoes;

  void exibirFichaTecnica(){

    System.out.println("""
            Título: %s
            Artista: %s
            """.formatted(titulo, artista));
  }

  void avaliar(double nota){
    avaliacao += nota;
    numAvaliacoes++;
  }

  void mediaAvaliacoes(){
    System.out.println(String.format("Média: %.2f", (avaliacao / numAvaliacoes)));
  }



}
