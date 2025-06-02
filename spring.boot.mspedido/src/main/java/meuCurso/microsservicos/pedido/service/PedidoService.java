package meuCurso.microsservicos.pedido.service;

import meuCurso.microsservicos.pedido.model.ItemPedido;
import meuCurso.microsservicos.pedido.model.Pedido;
import meuCurso.microsservicos.pedido.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido salvarPedido(Pedido pedido){
        if(pedido.getItens() != null) {
            for(ItemPedido itemPedido : pedido.getItens()){
                itemPedido.setPedido(pedido);
            }
        }

        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos(){
        return pedidoRepository.findAll();
    }


}
