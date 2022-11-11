package com.proyect1.app.web.Models;

import javax.persistence.*;

@NamedNativeQuery(name = "VentaGraf.findPlayerNameDtoById_Named",
query = "SELECT TOP 10 venta_articulo.cod_barras CODE, SUM(venta_articulo.cantidad) TOTAL FROM venta_articulo GROUP BY venta_articulo.cod_barras ORDER BY TOTAL DESC",
		resultSetMapping = "Mapping.VentaGraf")

@SqlResultSetMapping(name = "Mapping.VentaGraf", 
classes = @ConstructorResult(targetClass = VentaGraf.class,
columns = {@ColumnResult(name = "Code"),
		@ColumnResult (name = "Total")
}))

public class VentaGraf {
	
private String Code;
private String Total;

public String getCode() {
	return Code;
}
public void setCode(String code) {
	Code = code;
}
public String getTotal() {
	return Total;
}
public void setTotal(String total) {
	Total = total;
}


}
