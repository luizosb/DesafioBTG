package btg.desafio.spring.boot.pedidos.persistance.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_cliente")
    private Long codigoCliente;

    @Column(name = "pedido")
    private int pedido;

    @OneToMany(cascade=CascadeType.PERSIST)
    @Column(name = "item")
    private List<Itens> item;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Pedido> pedidoList;
//
//    public List<Pedido> getPedidoList() {
//        return pedidoList;
//    }
//
//    public void setPedidoList(List<Pedido> pedidoList) {
//        this.pedidoList = pedidoList;
//    }

    public Long getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

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
