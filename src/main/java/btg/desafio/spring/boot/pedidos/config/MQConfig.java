package btg.desafio.spring.boot.pedidos.config;

import javax.annotation.PostConstruct;

import btg.desafio.spring.boot.pedidos.utils.QueueUtils;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static btg.desafio.spring.boot.pedidos.utils.QueueUtils.*;

@Component
public class MQConfig {

    private static final String NOME_EXCHANGE = "amq.direct";

    private AmqpAdmin amqpAdmin;

    public MQConfig(AmqpAdmin amqpAdmin) {
        this.amqpAdmin = amqpAdmin;
    }

    private Queue fila(String nomeFila){
        return new Queue(nomeFila, true, false, false);
    }

    private DirectExchange trocaDireta(){
        return new DirectExchange(NOME_EXCHANGE);
    }

    private Binding relacionamento(Queue fila, DirectExchange troca){
        return new Binding(fila.getName(), Binding.DestinationType.QUEUE,
                troca.getName(), fila.getName(), null);
    }

    /**
     * Farei por último por falta de conhecimento de filas
     */
    //@PostConstruct
    private void adiciona(){
        Queue filaCliente = this.fila(FILA_CLIENTE);

        DirectExchange troca = this.trocaDireta();

        Binding ligacao = this.relacionamento(filaCliente, troca);

        this.amqpAdmin.declareQueue(filaCliente);
        this.amqpAdmin.declareExchange(troca);
        this.amqpAdmin.declareBinding(ligacao);
    }
}
