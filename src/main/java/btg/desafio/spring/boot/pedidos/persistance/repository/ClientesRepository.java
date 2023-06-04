package btg.desafio.spring.boot.pedidos.persistance.repository;

import btg.desafio.spring.boot.pedidos.persistance.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
