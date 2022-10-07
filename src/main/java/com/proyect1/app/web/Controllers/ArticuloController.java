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

import com.proyect1.app.web.Models.Articulo;
import com.proyect1.app.web.Repository.ArticuloRepository;

@CrossOrigin(origins = "http://127.0.0.1:5173/")
@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	private ArticuloRepository articuloRepository;

	@GetMapping("/articulo")
	public ResponseEntity<List<Articulo>> getArticulo() {
		try {
			List<Articulo> tutorials = new ArrayList<Articulo>();
			this.articuloRepository.findAll().forEach(tutorials :: add);
			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/articulo/{id}")
	public ResponseEntity<Articulo> getArticuloById(@PathVariable("id") String id) {
		Optional<Articulo> tutorialData = articuloRepository.findById(id);

		if (tutorialData.isPresent()) {
			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
