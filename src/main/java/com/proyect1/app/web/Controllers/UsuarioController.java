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

import com.proyect1.app.web.Models.Usuario;
import com.proyect1.app.web.Repository.UsuarioRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	@GetMapping("/usuario")
	public ResponseEntity<List<Usuario>> getUsuario() {
		try {
			List<Usuario> tutorials = new ArrayList<Usuario>();
			this.userRepository.findAll().forEach(tutorials :: add);
			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") String id) {
		Optional<Usuario> tutorialData = userRepository.findById(id);

		if (tutorialData.isPresent()) {
			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
}
