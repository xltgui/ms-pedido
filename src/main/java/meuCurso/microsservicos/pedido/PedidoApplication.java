package meuCurso.microsservicos.pedido;

import meuCurso.microsservicos.pedido.model.Pedido;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PedidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidoApplication.class, args);
		Pedido p = new Pedido();
		//p.setDescricao("TESTE DESCRICAO");
	}

}
