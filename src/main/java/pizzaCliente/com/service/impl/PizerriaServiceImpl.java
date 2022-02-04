package pizzaCliente.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pizzaCliente.com.client.OpenFeingClient;
import pizzaCliente.com.entity.Pizerria;
import pizzaCliente.com.service.PizerriaService;

@Service
public class PizerriaServiceImpl implements PizerriaService {
	
	@Autowired
	private OpenFeingClient cliente;

	@Override
	public List<Pizerria> asignarClientePizerria() {
		
		List<Pizerria> listarPizerria = new ArrayList<>();
		
		Pizerria pizerria = new Pizerria();
		pizerria.setPizerria("PapaYongs");
		pizerria.setListadoClientes(cliente.listadoCliente());
		listarPizerria.add(pizerria);
		
		return listarPizerria;
	}

}
