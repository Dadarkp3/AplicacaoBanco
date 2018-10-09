package br.com.ufba.engsoft;

public class ContaPoupanca extends Conta{
    public static double taxaDeJuros = 0.03;

    public ContaPoupanca(ClienteEspecial cliente, Double limite) {
        super(cliente, limite);
    }

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public static double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public static void setTaxaDeJuros(double taxaDeJuros) {
        ContaPoupanca.taxaDeJuros = taxaDeJuros;
    }
}
