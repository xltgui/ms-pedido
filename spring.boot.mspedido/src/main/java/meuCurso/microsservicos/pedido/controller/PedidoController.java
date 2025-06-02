package meuCurso.microsservicos.pedido.controller;

import lombok.AllArgsConstructor;
import meuCurso.microsservicos.pedido.model.Pedido;
import meuCurso.microsservicos.pedido.repository.PedidoRepository;
import meuCurso.microsservicos.pedido.service.PedidoService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@AllArgsConstructor

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final RabbitTemplate rabbitTemplate;
    private PedidoService pedidoService;

    public PedidoController(RabbitTemplate rabbitTemplate, PedidoService pedidoService) {
        this.rabbitTemplate = rabbitTemplate;
        this.pedidoService = pedidoService;
    }

    @Value("${broker.queue.processamento.name}")
    private String routingKey;

    @PostMapping
    public String criarPedido(@RequestBody Pedido pedido) {
        Pedido pedidoSalvo = pedidoService.salvarPedido(pedido);
        rabbitTemplate.convertAndSend("",routingKey, pedidoSalvo);
        return "O pedido " + pedido.getDescricao() + " foi criado com sucesso!!!";
    }

    @GetMapping
    public List<Pedido> listarPedidos(){
        return pedidoService.listarPedidos();
    }

}
