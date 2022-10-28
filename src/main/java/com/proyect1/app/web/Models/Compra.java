package com.proyect1.app.web.Models;

public class Compra {
	
	private String cod_barras;
	private int cantidad;
	private double precioUnidad;
		
	public Compra() {
		
	}
	
	public Compra(String cod_barras, int cantidad, double precioUnidad, boolean add) {
		this.cod_barras = cod_barras;
		this.cantidad = cantidad;
		this.precioUnidad = precioUnidad;
	}

	public String getCod_barras() {
		return cod_barras;
	}

	public void setCod_barras(String cod_barras) {
		this.cod_barras = cod_barras;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getprecioUnidad() {
		return precioUnidad;
	}

	public void setprecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	
	
	
}
