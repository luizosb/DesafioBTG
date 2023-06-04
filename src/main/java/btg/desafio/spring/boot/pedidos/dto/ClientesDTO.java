package btg.desafio.spring.boot.pedidos.dto;

import btg.desafio.spring.boot.pedidos.persistance.model.Itens;

import java.io.Serializable;
import java.util.List;

public class ClientesDTO implements Serializable {

    private int pedido;

    private List<Itens> itens;

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }
}
