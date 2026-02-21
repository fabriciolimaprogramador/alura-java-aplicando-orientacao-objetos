//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.

  Pessoa pessoa1 = new Pessoa();
  pessoa1.nome = "Ana";
  pessoa1.idade = 20;

  System.out.println(pessoa1.nome + " tem " + pessoa1.idade);

  pessoa1.fazAniversario();

  System.out.println("A idade agora é: " + pessoa1.idade);

  Pessoa pessoa2 = new Pessoa();
  pessoa2.nome = "Carlos";
  pessoa2.idade = 20;

  System.out.println(pessoa2.nome + " tem " + pessoa2.idade);

  pessoa2.fazAniversario();

  System.out.println("A idade agora é: " + pessoa2.idade);




}
