public class Main {

  static void main(String[] args) {
    Produto produto = new Produto();
    produto.nome = "Teclado";
    produto.preco = 100.0;
    produto.descontoParaPix = 10;

    System.out.println("Preço final: " + produto.pegaPrecoFinal(true));
    System.out.println("Preço final: " + produto.pegaPrecoFinal(false));
  }

}
