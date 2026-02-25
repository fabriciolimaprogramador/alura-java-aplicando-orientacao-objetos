package br.dev.fabricio.screenmatch.desafio.aula02;

public class AlunoTeste {

  static void main(String[] args) {
    Aluno fabricio = new Aluno("Fabrício", 7, 8);
    double media = fabricio.calcularMedia();
    System.out.println(String.format("Média das notas %.2f", media));
  }

}
