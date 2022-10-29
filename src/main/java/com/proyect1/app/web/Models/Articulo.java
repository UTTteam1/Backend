package com.proyect1.app.web.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo {

	@Id
	private String cod_barras;
	
	@Column(name = "cod_asociado")
	private String cod_asociado;
	@Column(name = "id_clasificacion")
	private String id_clasificacion;
	@Column(name = "cod_interno")
	private String cod_interno;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "descripcion_corta")
	private String descripcion_corta;
	@Column(name = "cantidad_um")
	private final String cantidad_um="1.000";
	@Column(name = "id_unidad")
	private String id_unidad;
	@Column(name = "id_proveedor")
	private String id_proveedor;
	@Column(name = "precio_compra")
	private String precio_compra;
	@Column(name = "utilidad")
	private String utilidad;
	@Column(name = "precio_venta")
	private String precio_venta;
	@Column(name = "tipo_articulo")
	private String tipo_articulo;
	@Column(name = "stock")
	private String stock;
	@Column(name = "stock_min")
	private final String stock_min="0.000";
	@Column(name = "stock_max")
	private final String stock_max="0.000";
	@Column(name = "iva")
	private final String iva="0.16";
	@Column(name = "kit_fecha_ini")
	private String kit_fecha_ini;
	@Column(name = "kit_fecha_fin")
	private String kit_fecha_fin;
	@Column(name = "articulo_disponible")
	private final String articulo_disponible="1";
	@Column(name = "kit")
	private final String kit="0";
	@Column(name = "fecha_registro")
	private String fecha_registro;
	@Column(name = "visible")
	private final String visible="0";
	@Column(name = "puntos")
	private final String puntos="0";
	@Column(name = "last_update_inventory")
	private String last_update_inventory;
	@Column(name = "cve_producto")
	private String cve_producto;
	
	public Articulo() {
		
	}

	public Articulo(String cod_barras, String cod_asociado, String id_clasificacion, String cod_interno,
			String descripcion, String descripcion_corta, String id_unidad, String id_proveedor, String precio_compra,
			String utilidad, String precio_venta, String tipo_articulo, String stock, String kit_fecha_ini,
			String kit_fecha_fin, String fecha_registro, String last_update_inventory, String cve_producto) {
		this.cod_barras = cod_barras;
		this.cod_asociado = cod_asociado;
		this.id_clasificacion = id_clasificacion;
		this.cod_interno = cod_interno;
		this.descripcion = descripcion;
		this.descripcion_corta = descripcion_corta;
		this.id_unidad = id_unidad;
		this.id_proveedor = id_proveedor;
		this.precio_compra = precio_compra;
		this.utilidad = utilidad;
		this.precio_venta = precio_venta;
		this.tipo_articulo = tipo_articulo;
		this.stock = stock;
		this.kit_fecha_ini = kit_fecha_ini;
		this.kit_fecha_fin = kit_fecha_fin;
		this.fecha_registro = fecha_registro;
		this.last_update_inventory = last_update_inventory;
		this.cve_producto = cve_producto;
	}

	public String getCod_barras() {
		return cod_barras;
	}

	public void setCod_barras(String cod_barras) {
		this.cod_barras = cod_barras;
	}

	public String getCod_asociado() {
		return cod_asociado;
	}

	public void setCod_asociado(String cod_asociado) {
		this.cod_asociado = cod_asociado;
	}

	public String getId_clasificacion() {
		return id_clasificacion;
	}

	public void setId_clasificacion(String id_clasificacion) {
		this.id_clasificacion = id_clasificacion;
	}

	public String getCod_interno() {
		return cod_interno;
	}

	public void setCod_interno(String cod_interno) {
		this.cod_interno = cod_interno;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion_corta() {
		return descripcion_corta;
	}

	public void setDescripcion_corta(String descripcion_corta) {
		this.descripcion_corta = descripcion_corta;
	}

	public String getId_unidad() {
		return id_unidad;
	}

	public void setId_unidad(String id_unidad) {
		this.id_unidad = id_unidad;
	}

	public String getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(String id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public String getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(String precio_compra) {
		this.precio_compra = precio_compra;
	}

	public String getUtilidad() {
		return utilidad;
	}

	public void setUtilidad(String utilidad) {
		this.utilidad = utilidad;
	}

	public String getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(String precio_venta) {
		this.precio_venta = precio_venta;
	}

	public String getTipo_articulo() {
		return tipo_articulo;
	}

	public void setTipo_articulo(String tipo_articulo) {
		this.tipo_articulo = tipo_articulo;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getKit_fecha_ini() {
		return kit_fecha_ini;
	}

	public void setKit_fecha_ini(String kit_fecha_ini) {
		this.kit_fecha_ini = kit_fecha_ini;
	}

	public String getKit_fecha_fin() {
		return kit_fecha_fin;
	}

	public void setKit_fecha_fin(String kit_fecha_fin) {
		this.kit_fecha_fin = kit_fecha_fin;
	}

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public String getLast_update_inventory() {
		return last_update_inventory;
	}

	public void setLast_update_inventory(String last_update_inventory) {
		this.last_update_inventory = last_update_inventory;
	}

	public String getCve_producto() {
		return cve_producto;
	}

	public void setCve_producto(String cve_producto) {
		this.cve_producto = cve_producto;
	}
	
	
	
	
	
}