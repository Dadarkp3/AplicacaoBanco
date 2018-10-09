package br.com.ufba.engsoft;

public class Main {

    public static void main(String[] args) {
	    ClienteEspecial cliente = new ClienteEspecial("Daiane", "123124124");
	    Conta conta = new ContaPoupanca(cliente, 12.0);
	    conta.deposito(2.0);
	    try{
            conta.saque(10.0);
        }catch (BancoException b){
            System.out.printf(b.getMessage());
        }
    }
}
