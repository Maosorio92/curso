package com.cursojava.curso.controllers;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.models.Usuario;

@RestController
public class UsuarioController {	
	
	@GetMapping("usuario/{id}")	
	public Usuario getUsuario(@PathVariable int id) {
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Lucas");
		usuario.setApellido("Moy");
		usuario.setEmail("lucasmoy@hotmail.com");
		usuario.setTelefono("234234234");
		return usuario;
	}

	@RequestMapping(value="usuarioedit")
	public Usuario editar() {
		Usuario usuario=new Usuario();
		usuario.setNombre("Lucas");
		usuario.setApellido("Moy");
		usuario.setEmail("lucasmoy@hotmail.com");
		usuario.setTelefono("234234234");
		return usuario;
	}
	
	@RequestMapping(value="usuariodel")
	public Usuario eliminar() {
		Usuario usuario=new Usuario();
		usuario.setNombre("Lucas");
		usuario.setApellido("Moy");
		usuario.setEmail("lucasmoy@hotmail.com");
		usuario.setTelefono("234234234");
		return usuario;
	}
	
	@RequestMapping(value="usuariobusc")
	public Usuario buscar() {
		Usuario usuario=new Usuario();
		usuario.setNombre("Lucas");
		usuario.setApellido("Moy");
		usuario.setEmail("lucasmoy@hotmail.com");
		usuario.setTelefono("234234234");
		return usuario;
	}
}
