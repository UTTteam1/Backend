package com.proyect1.app.web.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect1.app.web.Models.VentaGraf;
import com.proyect1.app.web.Models.VentaInt;
import com.proyect1.app.web.Models.Venta_articulo;
import com.proyect1.app.web.Repository.Venta_articuloRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Venta_articuloController {
	
	@Autowired
	private Venta_articuloRepository vent_articuloRepository;

	@GetMapping("/ventArt")
	public ResponseEntity<List<Venta_articulo>> getVentaArticulo() {
		try {
			List<Venta_articulo> tutorials = new ArrayList<Venta_articulo>();
			this.vent_articuloRepository.findAll().forEach(tutorials :: add);
			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/ventaArticulo")
	public ResponseEntity<List<VentaGraf>> VentaGrafs() {
		try {
			List<VentaInt> tutorials = new ArrayList<VentaInt>();
			List<VentaGraf> tutorials1 = new ArrayList<VentaGraf>();
			
			this.vent_articuloRepository.getVentaGraf().forEach(tutorials :: add);
			
			 for (VentaInt ventaI : tutorials) {
              VentaGraf ventag = new VentaGraf();
              
             ventag.setCode(ventaI.getCode());
             ventag.setTotal(ventaI.getTotal());
              tutorials1.add(ventag);
			 }
			 
		tutorials1.stream().forEach(System.out :: println);
		if (tutorials.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

			return new ResponseEntity<>(tutorials1, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
