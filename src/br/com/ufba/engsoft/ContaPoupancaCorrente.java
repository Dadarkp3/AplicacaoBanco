package br.com.ufba.engsoft;

public class ContaPoupancaCorrente extends ContaPoupanca implements IContaCorrente {

    public ContaPoupancaCorrente(ClienteEspecial cliente, Double limite) {
        super(cliente, limite);
    }

    public ContaPoupancaCorrente(Cliente cliente) {
        super(cliente);
    }
}
