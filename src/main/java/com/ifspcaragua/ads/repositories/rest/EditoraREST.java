package com.ifspcaragua.ads.repositories.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifspcaragua.ads.entities.Editora;
import com.ifspcaragua.ads.entities.Pais;
import com.ifspcaragua.ads.repositories.RepositoryEditora;
import com.ifspcaragua.ads.repositories.RepositoryPais;

@RestController
@RequestMapping("/editoras")
public class EditoraREST {
	@Autowired
	private RepositoryEditora repositorio;
	@Autowired
	private RepositoryPais repositorioPais;

	public EditoraREST() {
// TODO Auto-generated constructor stub
	}

	@GetMapping
	public List listar() {
		return repositorio.findAll();
	}

	@GetMapping(value = "/{id}")
	public Editora buscarPorId(@PathVariable Long id) {
		Editora editora = repositorio.findById(id).get();
		return editora;
	}

	@PostMapping
	public Editora salvar(@RequestBody Editora editora) {
		Pais pais = repositorioPais.findById(editora.getPais().getId()).get();
		Editora tmp = repositorio.save(editora);
		tmp.getPais().setPais(pais.getPais());
		return tmp;
	}

	@PutMapping
	public void editar(@RequestBody Editora editora) {
		if (editora.getId() > 0) {
			repositorio.save(editora);
		}
	}

	@DeleteMapping
	public void excluir(@RequestBody Editora editora) {
		repositorio.delete(editora);
	}
}