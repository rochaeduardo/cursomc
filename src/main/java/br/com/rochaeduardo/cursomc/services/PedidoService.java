package br.com.rochaeduardo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rochaeduardo.cursomc.domain.Pedido;
import br.com.rochaeduardo.cursomc.repositories.PedidoRepository;
import br.com.rochaeduardo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto de id: " + id + " não foi encontrado!"));
	}
}
