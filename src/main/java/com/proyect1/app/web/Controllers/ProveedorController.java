package com.proyect1.app.web.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyect1.app.web.Models.Proveedor;
import com.proyect1.app.web.Repository.ProveedorRepository;

@CrossOrigin(origins = "http://127.0.0.1:5173/")
@RestController
@RequestMapping("/api")
public class ProveedorController {
	
	private ProveedorRepositoryController provRepositoryController = new ProveedorRepositoryController();
	@Autowired
	private ProveedorRepository proveedorRepository;
	
	@GetMapping("/verproveedor")
	public List<Proveedor> usuariosCorto() {
		return this.provRepositoryController.GetProveedor(proveedorRepository);
	}
	
	
	@GetMapping("/proveedor")
	public ResponseEntity<List<Proveedor>> Proveedores() {
		try {
			List<Proveedor> tutorials = new ArrayList<Proveedor>();

			this.proveedorRepository.findAll().forEach(tutorials::add);

			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/proveedor/{id}")
	public ResponseEntity<Proveedor> getProveedorById(@PathVariable("id") String id) {
		Optional<Proveedor> tutorialData = proveedorRepository.findById(id);

		if (tutorialData.isPresent()) {
			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

	@PostMapping("/proveedor")
	public ResponseEntity<Proveedor> createProveedor(@RequestBody Proveedor proveedor) {
		try {
			
		    String result = java.util.UUID.randomUUID().toString();
		    result.replaceAll("-", "");
		    result.substring(0, 32);
		    
		    proveedor.setId_proveedor(result);
		    
			Proveedor _tutorial = this.proveedorRepository.save(proveedor);
			
			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@PutMapping("/proveedor/{id}")
	public ResponseEntity<Proveedor> updateProveedor(@PathVariable("id") String id, @RequestBody Proveedor proveedor) {
		Optional<Proveedor> tutorialData = proveedorRepository.findById(id);

		if (tutorialData.isPresent()) {
			Proveedor _proveedor = tutorialData.get();
			_proveedor.setRfc(proveedor.getRfc());
			_proveedor.setRazon_social(proveedor.getRazon_social());
			_proveedor.setNombre_contacto(proveedor.getNombre_contacto());
			_proveedor.setTel_principal(proveedor.getTel_principal());
			_proveedor.setTel_movil(proveedor.getTel_movil());
			_proveedor.setE_mail(proveedor.getE_mail());
			_proveedor.setEstatus(proveedor.getEstatus());
			_proveedor.setFecha_registro(proveedor.getFecha_registro());
			return new ResponseEntity<>(proveedorRepository.save(_proveedor), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@DeleteMapping("/proveedor/{id}")
	public ResponseEntity<String> deleteProveedor(@PathVariable("id") String id) {
		try {
			proveedorRepository.deleteById(id);
			 return new ResponseEntity<>(HttpStatus.OK + ": Registro Eliminado con exito", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
