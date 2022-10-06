package com.proyect1.app.web.Controllers;

import java.util.ArrayList;
import java.util.List;
import com.proyect1.app.web.Repository.ProveedorRepository;
import com.proyect1.app.web.Models.Proveedor;


public class ProveedorRepositoryController {

	public List<Proveedor> GetProveedor(ProveedorRepository proveedorRepository){
		List<Proveedor> proveedores = new ArrayList<Proveedor>();
		List<Proveedor> proveedores_result = proveedorRepository.findAll();

		for (Proveedor proveedor : proveedores_result) {
			proveedores.add(proveedor);
		}
		return proveedores;
	}
	
	
}
