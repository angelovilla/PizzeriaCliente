package pizzaCliente.com.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import pizzaCliente.com.entity.Cliente;

@FeignClient(name = "examfinal", url="localhost:63170")
public interface OpenFeingClient {
	
	
	@GetMapping("cliente/listar")
	public List<Cliente> listadoCliente();
}
