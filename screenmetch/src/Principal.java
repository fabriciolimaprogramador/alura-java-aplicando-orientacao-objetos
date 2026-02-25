import br.dev.fabricio.screenmatch.modelos.Filme;

public class Principal {

  public static void main(String[] args) {

    Filme meuFilme = new Filme();
    meuFilme.setNome("O poderoso chefão");
    meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);
    System.out.println(meuFilme);
    meuFilme.exibeFichaTecnica();

    meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);
    System.out.println(meuFilme.getTotalDeAvaliacoes());
    System.out.println(String.format("Média: %.2f", meuFilme.pegaAvaliacoes()) );

  }

}
