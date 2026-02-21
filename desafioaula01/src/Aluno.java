public class Aluno {

  String nome;
  int idade;

  void exibeInformacoes() {
    String informacoes = """
            Nome: %s
            Idade: %d
            """.formatted(nome, idade);
    System.out.println(informacoes);
  }

}
