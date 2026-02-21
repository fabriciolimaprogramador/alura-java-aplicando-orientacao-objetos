public class Carro {

  String modelo;
  int ano;
  String cor;

  void exibirFichaTecnica(){

    String ficha = """
            Modelo: %s
            Ano: %d
            Cor: %s
            """.formatted(modelo, ano, cor);
    System.out.println("Ficha técnica");
    System.out.println(ficha);

  }

  int calculaIdade(int anoAtual) {
    return anoAtual - ano;
  }

}
