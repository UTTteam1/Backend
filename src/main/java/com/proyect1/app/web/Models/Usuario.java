package com.proyect1.app.web.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	private String user_name;
	
	@Column(name = "password")
	private String password;
	@Column(name = "tipo_usuario")
	private String tipo_usuario;
	@Column(name = "enable")
	private String enable;
	@Column(name = "user_code_bascula")
	private String user_code_bascula;
	@Column(name = "fecha_registro")
	private String fecha_registro;
	
	public Usuario() {
		
	}

	public Usuario(String user_name, String password, String tipo_usuario, String enable, String user_code_bascula,
			String fecha_registro) {
		this.user_name = user_name;
		this.password = password;
		this.tipo_usuario = tipo_usuario;
		this.enable = enable;
		this.user_code_bascula = user_code_bascula;
		this.fecha_registro = fecha_registro;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getUser_code_bascula() {
		return user_code_bascula;
	}

	public void setUser_code_bascula(String user_code_bascula) {
		this.user_code_bascula = user_code_bascula;
	}

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	
	
	
}
