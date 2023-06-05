package btg.desafio.spring.boot.pedidos.dto;

import btg.desafio.spring.boot.pedidos.persistance.model.Clientes;
import jakarta.persistence.Column;

import java.io.Serializable;

public class ItensDTO implements Serializable {

    private String produto;

    private int qtd;

    private double preco;

    private Clientes clientes;

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
