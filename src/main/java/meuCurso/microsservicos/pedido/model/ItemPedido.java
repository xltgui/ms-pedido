package meuCurso.microsservicos.pedido.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantidade;

    @ManyToOne
    @JoinColumn(name= "pedido_id")
    @JsonBackReference
    private Pedido pedido;

    /*"""
        select * from pedido p inner join item_pedido ip on (p.id = ip.pedido_id)
    """
    */
}
