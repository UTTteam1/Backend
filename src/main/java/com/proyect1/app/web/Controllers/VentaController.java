package com.proyect1.app.web.Controllers;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect1.app.web.Models.Articulo;
import com.proyect1.app.web.Models.Compra;
import com.proyect1.app.web.Models.Venta;
import com.proyect1.app.web.Models.Venta_articulo;
import com.proyect1.app.web.Repository.ArticuloRepository;
import com.proyect1.app.web.Repository.VentaRepository;
import com.proyect1.app.web.Repository.Venta_articuloRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class VentaController {
	
	@Autowired
	private VentaRepository ventaRepository;
	
	@Autowired
	private Venta_articuloRepository venta_artRepository;
	
	@Autowired
	private ArticuloRepository articuloRepository;
	
	@GetMapping("/venta")
	public ResponseEntity<List<Venta>> getVenta() {
		try {
			List<Venta> tutorials = new ArrayList<Venta>();
			this.ventaRepository.findAll().forEach(tutorials :: add);
			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@GetMapping("/venta/{id}")
	public ResponseEntity<Venta> getVentaById(@PathVariable("id") String id) {
		Optional<Venta> tutorialData = ventaRepository.findById(id);

		if (tutorialData.isPresent()) {
			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PostMapping("/venta")
	public ResponseEntity<Venta> createVenta(@RequestBody List<Compra> ticket) {
		Venta venta = new Venta();
		int i=1;
		
		String result = java.util.UUID.randomUUID().toString();
	    result.replaceAll("-", "");
	    result.substring(0, 32);
	    
	    java.util.Date date = new Date();
		Object param = new java.sql.Timestamp(date.getTime());
		String fecha = param.toString();
	    
		int numR=ticket.size();
		double total=0;
		
		try {
			
			for(Compra compra : ticket) {
				total+= (compra.getprecioUnidad()*compra.getCantidad());
			}
			 
			venta.setFecha_venta(fecha);
			venta.setId_venta(result);
			venta.setTotal_vendido(total);
			venta.setPago_efectivo(total);
			venta.setNum_registros(numR);
			
			Venta _tutorial = this.ventaRepository.save(venta);
			
			for(Compra compra : ticket) {
				Venta_articulo ventart = new Venta_articulo();
				Articulo art = new Articulo();
				ventart.setId_venta(venta.getId_venta());
				ventart.setNo_articulo(i);
				ventart.setCod_barras(compra.getCod_barras());
				ventart.setCantidad(compra.getCantidad());
				ventart.setPrecio_regular(compra.getprecioUnidad());
				ventart.setPrecio_vta(compra.getCantidad()*compra.getprecioUnidad());
				i=i+1;
				Optional<Articulo> tutorialData = articuloRepository.findById(compra.getCod_barras());
				art = tutorialData.get();
				double actStock = Double.parseDouble(art.getStock());
				art.setStock(""+(actStock-compra.getCantidad()));
				venta_artRepository.save(ventart);
				
			}
			
			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
