package com.proyect1.app.web.Controllers;

import java.util.ArrayList;
import java.util.Date;
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

import com.proyect1.app.web.Models.Articulo;
import com.proyect1.app.web.Repository.ArticuloRepository;

@CrossOrigin(origins = "*")
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
	
	@PostMapping("/articulo")
	public ResponseEntity<Articulo> createArticulo(@RequestBody Articulo articulo) {
	
		System.out.println(articulo.getId_clasificacion());
		
		java.util.Date date = new Date();
		Object param = new java.sql.Timestamp(date.getTime());
		String fecha = param.toString();
		
		try {
			Articulo _articulo = new Articulo();
			_articulo.setCod_barras(articulo.getCod_barras());
			_articulo.setFecha_registro(fecha);
			_articulo.setLast_update_inventory(fecha);
			
			_articulo.setId_clasificacion(articulo.getId_clasificacion());
			
			_articulo.setDescripcion(articulo.getDescripcion());
			_articulo.setDescripcion_corta(articulo.getDescripcion_corta());
			_articulo.setId_unidad(articulo.getId_unidad());
			_articulo.setId_proveedor(articulo.getId_proveedor());
			_articulo.setPrecio_compra(articulo.getPrecio_compra());
			_articulo.setUtilidad(articulo.getUtilidad());
			_articulo.setPrecio_venta(articulo.getPrecio_venta());
			_articulo.setTipo_articulo(articulo.getTipo_articulo());
			_articulo.setStock(articulo.getStock());
			_articulo.setCve_producto(articulo.getCve_producto());
			_articulo.setFecha_registro(articulo.getFecha_registro());
			_articulo.setLast_update_inventory(articulo.getLast_update_inventory());
			
		    Articulo _tutorial = this.articuloRepository.save(_articulo);
		   
			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/articulo/{id}")
	public ResponseEntity<String> deleteArticulo(@PathVariable("id") String id) {
		try {
			articuloRepository.deleteById(id);
			 return new ResponseEntity<>(HttpStatus.OK + ": Registro Eliminado con exito", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@PutMapping("/articulo/{id}")
	public ResponseEntity<Articulo> updateArticulo(@PathVariable("id") String id, @RequestBody Articulo articulo) {
		Optional<Articulo> tutorialData = articuloRepository.findById(id);

		if (tutorialData.isPresent()) {
			Articulo _articulo = tutorialData.get();
			_articulo.setCod_asociado(articulo.getCod_asociado());
			_articulo.setId_clasificacion(articulo.getId_clasificacion());
			_articulo.setCod_interno(articulo.getCod_interno());
			_articulo.setDescripcion(articulo.getDescripcion());
			_articulo.setDescripcion_corta(articulo.getDescripcion_corta());
			_articulo.setId_unidad(articulo.getId_unidad());
			_articulo.setId_proveedor(articulo.getId_proveedor());
			_articulo.setPrecio_compra(articulo.getPrecio_compra());
			_articulo.setUtilidad(articulo.getUtilidad());
			_articulo.setPrecio_venta(articulo.getPrecio_venta());
			_articulo.setTipo_articulo(articulo.getTipo_articulo());
			_articulo.setStock(articulo.getStock());
			_articulo.setKit_fecha_ini(articulo.getKit_fecha_ini());
			_articulo.setKit_fecha_fin(articulo.getKit_fecha_fin());
			_articulo.setFecha_registro(articulo.getFecha_registro());
			_articulo.setLast_update_inventory(articulo.getLast_update_inventory());
			_articulo.setCod_asociado(articulo.getCod_asociado());
			
			return new ResponseEntity<>(articuloRepository.save(_articulo), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
