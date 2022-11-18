package com.proyect1.app.web.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect1.app.web.Models.Usuario_permiso;
import com.proyect1.app.web.Repository.Usuario_permisoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Usuario_permisoController {
	
	@Autowired
	private Usuario_permisoRepository UpRepository;
	
	@GetMapping("/user_permiso")
	public ResponseEntity<List<Usuario_permiso>> getUsuario_permiso() {
		try {
			List<Usuario_permiso> tutorials = new ArrayList<Usuario_permiso>();
			this.UpRepository.findAll().forEach(tutorials :: add);
			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/user_permiso/{id}")
	public ResponseEntity<List<Usuario_permiso>> getUsuario_permisoById(@PathVariable("id") String id) {
		
		try {
			List<Usuario_permiso> tutorials = new ArrayList<Usuario_permiso>();
			List<Usuario_permiso> x = new ArrayList<Usuario_permiso>();
			this.UpRepository.findAll().forEach(x :: add);
			for (Usuario_permiso usp : x) {
				if(id.equals(usp.getId_permiso())) {
					tutorials.add(usp);
				}
			}
			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
