package meuCurso.microsservicos.processamento.dto;

import java.util.List;

public class PedidoDto {

    private Long id;
    private String descricao;


    private List<ItemDto> itens; // Adicionado o campo "itens"

    // Getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ItemDto> getItens() {
        return itens;
    }

    public void setItens(List<ItemDto> itens) {
        this.itens = itens;
    }
}
