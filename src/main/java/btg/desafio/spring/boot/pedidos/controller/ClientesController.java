package btg.desafio.spring.boot.pedidos.controller;

import btg.desafio.spring.boot.pedidos.dto.ClientesDTO;
import btg.desafio.spring.boot.pedidos.dto.ItensDTO;
import btg.desafio.spring.boot.pedidos.service.ClientesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ClientesController {

    @Autowired
    private ClientesService service;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/v1")
    public ResponseEntity create(@RequestBody ClientesDTO clientesDTO){
        service.create(clientesDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/valorMaximoPorPedido")
    public ResponseEntity buscarValorMaximoPorPedido(@RequestBody ItensDTO itensDTO){
        double valorMaximo = service.buscarValorTotalDoPedido(itensDTO.getCodigoPedido());
        return ResponseEntity.ok("Valor máximo: " + valorMaximo);
    }

//    @GetMapping("/qtdPorCLiente")
//    public ResponseEntity buscarPedidosPorCliente(@RequestBody ClientesDTO clientesDTO){
//        int pedidos = service.buscarPedidosPorCliente(clientesDTO.getCodigoCliente());
//        return ResponseEntity.ok("Pedidos por esse cliente: " + pedidos);
//    }
}
