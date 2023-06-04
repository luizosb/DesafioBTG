package btg.desafio.spring.boot.pedidos.dto;

import jakarta.persistence.Column;

import java.io.Serializable;

public class ItensDTO implements Serializable {

    private String produto;

    private int qtd;

    private double preco;

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
