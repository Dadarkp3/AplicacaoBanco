package br.com.ufba.engsoft;

public abstract class Conta {
    private Cliente cliente;
    private Double saldo;
    private Long numero;
    private Double limite;
    private Double limiteDisponível;
    public static Double taxaDeJurosLimite = 0.03;

    public Conta(Cliente cliente, Double limite) {
        this.cliente = cliente;
        this.limite = limite;
        this.limiteDisponível = limite;
        this.saldo = 0.0;
    }

    public Conta(Cliente cliente) {
        this(cliente, 0.0);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void deposito(Double deposito) {
        if(this.limiteDisponível < this.limite) {
            Double limite = this.limite - this.limiteDisponível;
        }
        this.saldo += deposito;
    }

    public void saque(Double saque) throws BancoException {
        if (saque <= this.saldo) {
            this.saldo -= saque;
            return;
        }
        if (this.cliente instanceof ClienteEspecial && saque < this.saldo+this.limiteDisponível) {
            this.saldo -= saque;
            this.limiteDisponível += this.saldo;
            this.saldo = 0.0;
            return;
        }
        throw new BancoException("Você não tem saldo suficiente para realizar essa operação");
    }
}
