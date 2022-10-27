package com.proyect1.app.web.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "venta_articulo")
public class Venta_articulo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_venta_articulo;
	
	@Column(name = "id_pos")
	private final int id_pos=1;
	
	@Column(name = "id_venta")
	private String id_venta;
	@Column(name = "no_articulo")
	private int no_articulo;
	@Column(name = "cod_barras")
	private String cod_barras;
	@Column(name = "user_code_bascula")
	private String user_code_bascula;
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "articulo_ofertado")
	private final int articulo_ofertado=0;
	@Column(name = "precio_regular")
	private double precio_regular;
	@Column(name = "cambio_precio")
	private final int cambio_precio=0;
	@Column(name = "iva")
	private double iva;
	@Column(name = "precio_vta")
	private double precio_vta;
	@Column(name = "porcent_desc")
	private final double porcent_desc=0;
	@Column(name = "cant_devuelta")
	private final double cant_devuelta=0;
	@Column(name = "user_name")
	private String user_name;
	@Column(name = "id_promo")
	private String id_promo;
	@Column(name = "no_promo_aplicado")
	private String no_promo_aplicado;
	
	public Venta_articulo() {
		
	}

	public Venta_articulo(String id_venta, int no_articulo, String cod_barras, String user_code_bascula,
			int cantidad, double precio_regular, double iva, double precio_vta, String user_name, String id_promo,
			String no_promo_aplicado) {
		this.id_venta = id_venta;
		this.no_articulo = no_articulo;
		this.cod_barras = cod_barras;
		this.user_code_bascula = user_code_bascula;
		this.cantidad = cantidad;
		this.precio_regular = precio_regular;
		this.iva = iva;
		this.precio_vta = precio_vta;
		this.user_name = user_name;
		this.id_promo = id_promo;
		this.no_promo_aplicado = no_promo_aplicado;
	}

	
	public int getId_venta_articulo() {
		return id_venta_articulo;
	}

	public void setId_venta_articulo(int id_venta_articulo) {
		this.id_venta_articulo = id_venta_articulo;
	}

	public String getId_venta() {
		return id_venta;
	}

	public void setId_venta(String id_venta) {
		this.id_venta = id_venta;
	}

	public int getId_pos() {
		return id_pos;
	}

	

	public int getNo_articulo() {
		return no_articulo;
	}

	public void setNo_articulo(int no_articulo) {
		this.no_articulo = no_articulo;
	}

	public String getCod_barras() {
		return cod_barras;
	}

	public void setCod_barras(String cod_barras) {
		this.cod_barras = cod_barras;
	}

	public String getUser_code_bascula() {
		return user_code_bascula;
	}

	public void setUser_code_bascula(String user_code_bascula) {
		this.user_code_bascula = user_code_bascula;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_regular() {
		return precio_regular;
	}

	public void setPrecio_regular(double precio_regular) {
		this.precio_regular = precio_regular;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getPrecio_vta() {
		return precio_vta;
	}

	public void setPrecio_vta(double precio_vta) {
		this.precio_vta = precio_vta;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getId_promo() {
		return id_promo;
	}

	public void setId_promo(String id_promo) {
		this.id_promo = id_promo;
	}

	public String getNo_promo_aplicado() {
		return no_promo_aplicado;
	}

	public void setNo_promo_aplicado(String no_promo_aplicado) {
		this.no_promo_aplicado = no_promo_aplicado;
	}

	
	
	
	
	
	
}
