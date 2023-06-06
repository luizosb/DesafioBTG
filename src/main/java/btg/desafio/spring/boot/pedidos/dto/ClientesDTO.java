package btg.desafio.spring.boot.pedidos.dto;

import btg.desafio.spring.boot.pedidos.persistance.model.Itens;
import java.io.Serializable;
import java.util.List;

public class ClientesDTO implements Serializable {

    private int codigoCliente;

    private int codigoPedido;

    private List<Itens> itens;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }
}
