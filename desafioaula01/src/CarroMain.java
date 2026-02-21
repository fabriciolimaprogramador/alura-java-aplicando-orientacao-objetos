public class CarroMain {

  static void main(String[] args) {
    Carro carro = new Carro();
    carro.modelo = "Tracker";
    carro.ano = 2025;
    carro.cor = "Prata";

    carro.exibirFichaTecnica();

    int idade = carro.calculaIdade(2026);
    System.out.println("Idade: " + idade);
  }

}
