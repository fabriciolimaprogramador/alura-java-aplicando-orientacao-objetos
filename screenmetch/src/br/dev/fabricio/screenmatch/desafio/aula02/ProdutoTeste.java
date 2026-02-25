package br.dev.fabricio.screenmatch.desafio.aula02;

public class ProdutoTeste {

  static void main() {

    Produto impressora = new Produto("Impressora", 377.09);
    System.out.println("Nome: " + impressora.getNome());
    System.out.println("Preço sem desconto: " + impressora.getPreco());
    impressora.aplicarDesconto(10);
    System.out.println(String.format("Preço com desconto: %.2f", impressora.getPreco()));

  }
}
