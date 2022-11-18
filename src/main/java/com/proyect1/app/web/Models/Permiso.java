package com.proyect1.app.web.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permiso")
public class Permiso {
	
	@Id
	private String id_permiso;
	
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "tipo_sistema")
	private String tipo_sistema;
	@Column(name = "fecha_registro")
	private String fecha_registro;
	
	public Permiso() {
		
	}

	public Permiso(String id_permiso, String descripcion, String tipo_sistema, String fecha_registro) {
		super();
		this.id_permiso = id_permiso;
		this.descripcion = descripcion;
		this.tipo_sistema = tipo_sistema;
		this.fecha_registro = fecha_registro;
	}

	public String getId_permiso() {
		return id_permiso;
	}

	public void setId_permiso(String id_permiso) {
		this.id_permiso = id_permiso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo_sistema() {
		return tipo_sistema;
	}

	public void setTipo_sistema(String tipo_sistema) {
		this.tipo_sistema = tipo_sistema;
	}

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	
	
	
	
}
