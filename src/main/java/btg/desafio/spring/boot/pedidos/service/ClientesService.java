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

    @Autowired
    private ItensRepository itensRepository;

    @Autowired
    private ModelMapper mapper;

    public void create(ClientesDTO clientesDTO) {
        Clientes clientes = mapper.map(clientesDTO, Clientes.class);
        clientesRepository.save(clientes);
    }

    public double buscarValorTotalDoPedido(int codigoPedido){
        return itensRepository.buscarValorMaximoPorPedido(codigoPedido);
    }

//    public int buscarPedidosPorCliente(int codigoCliente){
//        return clientesRepository.buscarPedidosPorCliente(codigoCliente);
//    }
}
