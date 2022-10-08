package com.proyect1.app.web.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
public class Direccion {

	@Id
	private String id_direccion;
	
	@Column(name = "id_cliente")
	private String id_cliente;
	
	@Column(name = "id_municipio")
	private Integer id_municipio;
	
	@Column(name = "id_entidad")
	private Integer id_entidad;
	
	@Column(name = "codigo_postal")
	private String codigo_postal;
	
	@Column(name = "colonia")
	private String colonia;
	
	@Column(name = "calle")
	private String calle;
	
	@Column(name = "no_interior")
	private String no_interior;
	
	@Column(name = "no_exterior")
	private String no_exterior;
	
	
	public Direccion() {
		
	}


	public Direccion(String id_direccion, String id_cliente, Integer id_municipio, Integer id_entidad,
			String codigo_postal, String colonia, String calle, String no_interior, String no_exterior) {
		this.id_direccion = id_direccion;
		this.id_cliente = id_cliente;
		this.id_municipio = id_municipio;
		this.id_entidad = id_entidad;
		this.codigo_postal = codigo_postal;
		this.colonia = colonia;
		this.calle = calle;
		this.no_interior = no_interior;
		this.no_exterior = no_exterior;
	}


	public String getId_direccion() {
		return id_direccion;
	}


	public void setId_direccion(String id_direccion) {
		this.id_direccion = id_direccion;
	}


	public String getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}


	public Integer getId_municipio() {
		return id_municipio;
	}


	public void setId_municipio(Integer id_municipio) {
		this.id_municipio = id_municipio;
	}


	public Integer getId_entidad() {
		return id_entidad;
	}


	public void setId_entidad(Integer id_entidad) {
		this.id_entidad = id_entidad;
	}


	public String getCodigo_postal() {
		return codigo_postal;
	}


	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}


	public String getColonia() {
		return colonia;
	}


	public void setColonia(String colonia) {
		this.colonia = colonia;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public String getNo_interior() {
		return no_interior;
	}


	public void setNo_interior(String no_interior) {
		this.no_interior = no_interior;
	}


	public String getNo_exterior() {
		return no_exterior;
	}


	public void setNo_exterior(String no_exterior) {
		this.no_exterior = no_exterior;
	}
	
	
	
}
