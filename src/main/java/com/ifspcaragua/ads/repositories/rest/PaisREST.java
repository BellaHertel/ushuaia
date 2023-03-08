package com.ifspcaragua.ads.repositories.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifspcaragua.ads.entities.Pais;
import com.ifspcaragua.ads.repositories.RepositoryPais;

@RestController
@RequestMapping("/paises")
public class PaisREST {
	@Autowired
	RepositoryPais repositorio;

	public PaisREST() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping
	public List<Pais> listar() {
		return repositorio.findAll();
	}

	@PostMapping
	public void salvar(@RequestBody Pais pais) {
		repositorio.save(pais);
	}

	@PutMapping
	public void editar(@RequestBody Pais pais) {
		if (pais.getId() > 0) {
			repositorio.save(pais);
		}

	}

	@DeleteMapping
	public void excluir(@RequestBody Pais pais) {
		repositorio.delete(pais);
	}
}