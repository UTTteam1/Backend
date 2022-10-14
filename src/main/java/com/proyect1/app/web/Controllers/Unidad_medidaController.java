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

import com.proyect1.app.web.Models.Unidad_medida;
import com.proyect1.app.web.Repository.Unidad_medidaRepository;

@CrossOrigin(origins = "http://127.0.0.1:5173/")
@RestController
@RequestMapping("/api")
public class Unidad_medidaController {

	@Autowired
	private Unidad_medidaRepository umRepository;
	
	@GetMapping("/unidadm")
	public ResponseEntity<List<Unidad_medida>> Unidades_medida() {
		try {
			List<Unidad_medida> tutorials = new ArrayList<Unidad_medida>();

			this.umRepository.findAll().forEach(tutorials::add);

			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/unidadm/{id}")
	public ResponseEntity<Unidad_medida> getUnidad_medidaById(@PathVariable("id") String id) {
		Optional<Unidad_medida> tutorialData = umRepository.findById(id);

		if (tutorialData.isPresent()) {
			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
