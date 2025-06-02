package meuCurso.microsservicos.pedido.repository;

import meuCurso.microsservicos.pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
