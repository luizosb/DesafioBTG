package btg.desafio.spring.boot.pedidos.persistance.repository;

import btg.desafio.spring.boot.pedidos.persistance.model.Clientes;
import btg.desafio.spring.boot.pedidos.persistance.model.Itens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

    @Query(nativeQuery = true, value = "SELECT SUM(it.preco * it.qtd) FROM itens it, clientes cli WHERE cli.pedido = ?")
    public double buscarValorMaximoPorPedido(Integer pedido);

}
