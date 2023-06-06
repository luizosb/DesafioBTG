package btg.desafio.spring.boot.pedidos.persistance.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "codigo_cliente")
    private int codigoCliente;

    @Column(name = "codigo_pedido")
    private int codigoPedido;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "clientes")
    @Column(name = "itens")
    private List<Itens> itens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
