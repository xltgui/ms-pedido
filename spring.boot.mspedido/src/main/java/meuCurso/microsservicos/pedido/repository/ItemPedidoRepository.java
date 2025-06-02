package meuCurso.microsservicos.pedido.repository;

import meuCurso.microsservicos.pedido.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
