package meuCurso.microsservicos.processamento.consumer;

import meuCurso.microsservicos.processamento.dto.PedidoDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ProcessamentoConsumer {

    @RabbitListener(queues = "${broker.queue.processamento.name}")
    public void listenerProcessamentoQueue(PedidoDto pedidoDto) {
        System.out.println("PEDIDO CONSUMIDO:" + pedidoDto.getDescricao());
    }
}
