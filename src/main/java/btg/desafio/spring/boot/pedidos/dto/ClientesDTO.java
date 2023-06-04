package btg.desafio.spring.boot.pedidos.dto;

import btg.desafio.spring.boot.pedidos.persistance.model.Itens;

import java.io.Serializable;
import java.util.List;

public class ClientesDTO implements Serializable {

    private int pedido;

    private List<Itens> item;

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public List<Itens> getItem() {
        return item;
    }

    public void setItem(List<Itens> item) {
        this.item = item;
    }

}
