package btg.desafio.spring.boot.pedidos.controller;

import btg.desafio.spring.boot.pedidos.dto.ClientesDTO;
import btg.desafio.spring.boot.pedidos.service.ClientesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ClientesController {

    @Autowired
    private ClientesService service;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity create(@RequestBody ClientesDTO clientesDTO){
        service.create(clientesDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
