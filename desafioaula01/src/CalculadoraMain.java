public class CalculadoraMain {

  static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    double numero = 3;
    System.out.println(String.format("O dobro de %.2f é %.2f", numero, calculadora.dobrar(numero)));
  }

}
