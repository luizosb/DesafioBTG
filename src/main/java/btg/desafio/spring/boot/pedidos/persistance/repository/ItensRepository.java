package btg.desafio.spring.boot.pedidos.persistance.repository;

import btg.desafio.spring.boot.pedidos.persistance.model.Itens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensRepository extends JpaRepository<Itens, Long> {

    @Query(nativeQuery = true, value = "SELECT SUM(preco * qtd) FROM itens WHERE codigo_pedido = ?")
    public double buscarValorMaximoPorPedido(int pedido);
}
