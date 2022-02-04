package pizzaCliente.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pizzaCliente.com.entity.Pizerria;
import pizzaCliente.com.service.PizerriaService;

@RestController
@RequestMapping("api/pizerria")
public class PizerriaController {
	
	@Autowired
	private PizerriaService service;
	
	@GetMapping("/listar")
	public List<Pizerria> asignarCliente(){
		return service.asignarClientePizerria();
	}

}
