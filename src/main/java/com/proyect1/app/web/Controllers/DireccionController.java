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

import com.proyect1.app.web.Models.Direccion;
import com.proyect1.app.web.Repository.DireccionRepository;

@CrossOrigin(origins = "http://127.0.0.1:5173/")
@RestController
@RequestMapping("/api")
public class DireccionController {

	@Autowired
	private DireccionRepository direccionRepository;
	
	@GetMapping("/direccion")
	public ResponseEntity<List<Direccion>> Direcciones() {
		try {
			List<Direccion> tutorials = new ArrayList<Direccion>();

			this.direccionRepository.findAll().forEach(tutorials::add);

			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/direccion/{id}")
	public ResponseEntity<Direccion> getDireccionById(@PathVariable("id") String id) {
		Optional<Direccion> tutorialData = direccionRepository.findById(id);

		if (tutorialData.isPresent()) {
			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
