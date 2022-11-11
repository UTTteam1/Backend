package com.proyect1.app.web.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.proyect1.app.web.Models.Venta_articulo;
import com.proyect1.app.web.Models.VentaGraf;
import com.proyect1.app.web.Models.VentaInt;

@Repository
public interface Venta_articuloRepository extends JpaRepository<Venta_articulo, String> {
	
@Query(value = "SELECT TOP 10 venta_articulo.cod_barras CODE, SUM(venta_articulo.cantidad) TOTAL FROM venta_articulo GROUP BY venta_articulo.cod_barras ORDER BY TOTAL DESC" , nativeQuery = true)
List<VentaInt> getVentaGraf();
}
