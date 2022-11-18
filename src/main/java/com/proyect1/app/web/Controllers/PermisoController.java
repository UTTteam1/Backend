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

import com.proyect1.app.web.Models.Permiso;
import com.proyect1.app.web.Repository.PermisoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PermisoController {
	
	@Autowired
	private PermisoRepository permRepository;
	
	@GetMapping("/permiso")
	public ResponseEntity<List<Permiso>> getPermiso() {
		try {
			List<Permiso> tutorials = new ArrayList<Permiso>();
			this.permRepository.findAll().forEach(tutorials :: add);
			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/permiso/{id}")
	public ResponseEntity<Permiso> getPermisoById(@PathVariable("id") String id) {
		Optional<Permiso> tutorialData = permRepository.findById(id);

		if (tutorialData.isPresent()) {
			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
}
