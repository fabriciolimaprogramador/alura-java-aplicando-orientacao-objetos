package br.dev.fabricio.screenmatch.outros;

public class Conta {
  private int numero;
  private int agencia;
  private double saldo;

  public void deposita(double valor) {
    saldo += valor;
  }

  public void saca(double valor) {
    if (valor <= saldo) {
      saldo -= valor;
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }



  public int getNumero() {
    return numero;
  }

  public int getAgencia() {
    return agencia;
  }

  public double getSaldo() {
    return saldo;
  }
}
