package btg.desafio.spring.boot.pedidos.persistance.model;

import jakarta.persistence.*;

@Entity
@Table(name = "itens")
public class Itens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_cliente")
    private Clientes clientes;

    @Column(name = "codigo_pedido")
    private int codigoPedido;

    @Column(name = "produto")
    private String produto;
    @Column(name = "qtd")
    private int qtd;
    @Column(name = "preco")
    private double preco;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }
}
