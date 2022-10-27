package com.proyect1.app.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyect1.app.web.Models.Venta_articulo;

@Repository
public interface Venta_articuloRepository extends JpaRepository<Venta_articulo, String> {

}
