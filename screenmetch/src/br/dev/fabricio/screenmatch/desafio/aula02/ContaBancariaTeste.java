package br.dev.fabricio.screenmatch.desafio.aula02;

public class ContaBancariaTeste {

  static void main() {
    ContaBancaria contaBancaria = new ContaBancaria();
    contaBancaria.setNumeroConta(123);
    contaBancaria.setSaldo(1000);
    contaBancaria.titular = "Fabricio";

    System.out.println("Titular: " + contaBancaria.titular);
    System.out.println("Número da conta: " + contaBancaria.getNumeroConta());
    System.out.println("Saldo: " + contaBancaria.getSaldo());


  }


}
