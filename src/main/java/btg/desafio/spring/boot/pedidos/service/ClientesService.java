package btg.desafio.spring.boot.pedidos.service;


import btg.desafio.spring.boot.pedidos.dto.ClientesDTO;
import btg.desafio.spring.boot.pedidos.persistance.model.Clientes;
import btg.desafio.spring.boot.pedidos.persistance.repository.ClientesRepository;
import btg.desafio.spring.boot.pedidos.persistance.repository.ItensRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

//    @Autowired
//    private PedidoRepository pedidosRepository;
//
    @Autowired
    private ItensRepository itensRepository;

    @Autowired
    private ModelMapper mapper;

    public void create(ClientesDTO clientesDTO) {
        Clientes clientes = mapper.map(clientesDTO, Clientes.class);
//        Pedido pedidos = mapper.map(pedidosDTO, Pedido.class);
//        Itens itens = mapper.map(itensDTO, Itens.class);

        clientesRepository.save(clientes);
//        pedidosRepository.save(pedidos);
//        itensRepository.save(itens);
    }
}
