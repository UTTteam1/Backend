package com.proyect1.app.web.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	private String id_cliente;
	
	@Column(name = "rfc")
	private String rfc;
	@Column(name = "razon_social")
	private String razon_social;
	@Column(name = "regimen_fiscal")
	private String regimen_fiscal;
	@Column(name = "contacto")
	private String contacto;
	@Column(name = "e_mail")
	private String e_mail;
	@Column(name = "e_mail2")
	private String e_mail2;
	
	public Cliente() {
		
	}
	
	public Cliente(String id_cliente, String rfc, String razon_social, String regimen_fiscal, String contacto,
			String e_mail, String e_mail2) {
		this.id_cliente = id_cliente;
		this.rfc = rfc;
		this.razon_social = razon_social;
		this.regimen_fiscal = regimen_fiscal;
		this.contacto = contacto;
		this.e_mail = e_mail;
		this.e_mail2 = e_mail2;
	}
	
	public Cliente(String rfc, String razon_social, String regimen_fiscal, String contacto,
			String e_mail, String e_mail2) {
		this.rfc = rfc;
		this.razon_social = razon_social;
		this.regimen_fiscal = regimen_fiscal;
		this.contacto = contacto;
		this.e_mail = e_mail;
		this.e_mail2 = e_mail2;
	}

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getRegimen_fiscal() {
		return regimen_fiscal;
	}

	public void setRegimen_fiscal(String regimen_fiscal) {
		this.regimen_fiscal = regimen_fiscal;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getE_mail2() {
		return e_mail2;
	}

	public void setE_mail2(String e_mail2) {
		this.e_mail2 = e_mail2;
	}

	@Override
	public String toString() {
		return "Cliente [rfc=" + rfc + ", razon_social=" + razon_social + ", regimen_fiscal=" + regimen_fiscal
				+ ", contacto=" + contacto + ", e_mail=" + e_mail + ", e_mail2=" + e_mail2 + "]";
	}
	
	
	
}
