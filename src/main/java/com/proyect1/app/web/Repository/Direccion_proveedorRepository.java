package com.proyect1.app.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect1.app.web.Models.Direccion_proveedor;

@Repository
public interface Direccion_proveedorRepository extends JpaRepository<Direccion_proveedor, String> {
}

