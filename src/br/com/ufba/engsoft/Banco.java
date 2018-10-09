package br.com.ufba.engsoft;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<Cliente>();
    }

    public void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
