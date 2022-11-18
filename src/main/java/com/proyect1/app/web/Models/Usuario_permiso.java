package com.proyect1.app.web.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_permiso")
public class Usuario_permiso {
	
	@Id
	private String id_permiso;
	
	@Column(name = "user_name")
	private String user_name;
	@Column(name = "valor_num")
	private String valor_num;
	@Column(name = "fecha_registro")
	private String fecha_registro;
	
	public Usuario_permiso() {
		
	}

	public Usuario_permiso(String user_name, String id_permiso, String valor_num, String fecha_registro) {
		this.user_name = user_name;
		this.id_permiso = id_permiso;
		this.valor_num = valor_num;
		this.fecha_registro = fecha_registro;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getId_permiso() {
		return id_permiso;
	}

	public void setId_permiso(String id_permiso) {
		this.id_permiso = id_permiso;
	}

	public String getValor_num() {
		return valor_num;
	}

	public void setValor_num(String valor_num) {
		this.valor_num = valor_num;
	}

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	
	
}
