package btg.desafio.spring.boot.pedidos.persistance.repository;

import btg.desafio.spring.boot.pedidos.persistance.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

//    @Query("select count(*) from clientes group by codigo_cliente having codigo_cliente=:codigo")
//    public int buscarPedidosPorCliente(@Param("codigo") int codigoCliente);


}
