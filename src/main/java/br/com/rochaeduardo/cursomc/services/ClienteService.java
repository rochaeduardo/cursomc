package br.com.rochaeduardo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rochaeduardo.cursomc.domain.Cliente;
import br.com.rochaeduardo.cursomc.repositories.ClienteRepository;
import br.com.rochaeduardo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
         Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto de id: " + id + " não foi encontrado!"));
	}
}
