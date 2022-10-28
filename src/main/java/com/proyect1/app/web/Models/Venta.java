package com.proyect1.app.web.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	private String id_venta;
	
	@Column(name = "id_pos")
	private final int id_pos = 1;
	@Column(name = "vendedor")
	private final String vendedor = "Adair";
	
	
	@Column(name = "folio", insertable=false)
	private int folio;
	
	@Column(name = "fecha_venta")
	private String fecha_venta;
	@Column(name = "total_vendido")
	private double total_vendido;
	@Column(name = "pago_efectivo")
	private double pago_efectivo;
	@Column(name = "pago_cheque")
	private final double pago_cheque = 0;
	@Column(name = "pago_vales")
	private final double pago_vales = 0;
	@Column(name = "pago_tc")
	private final double pago_tc = 0;
	@Column(name = "supervisor")
	private String supervisor;
	@Column(name = "upload")
	private final int upload=1;
	@Column(name = "num_registros")
	private int num_registros;
	
	public Venta() {
		
	}
	
	

	public Venta(String id_venta, int folio, String fecha_venta, double total_vendido, double pago_efectivo,
			String supervisor, int num_registros) {
		this.id_venta = id_venta;
		this.folio = folio;
		this.fecha_venta = fecha_venta;
		this.total_vendido = total_vendido;
		this.pago_efectivo = pago_efectivo;
		this.supervisor = supervisor;
		this.num_registros = num_registros;
	}



	public String getId_venta() {
		return id_venta;
	}

	public void setId_venta(String id_venta) {
		this.id_venta = id_venta;
	}

	public int getFolio() {
		return folio;
	}


	public String getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(String fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public double getTotal_vendido() {
		return total_vendido;
	}

	public void setTotal_vendido(double total_vendido) {
		this.total_vendido = total_vendido;
	}

	public double getPago_efectivo() {
		return pago_efectivo;
	}

	public void setPago_efectivo(double pago_efectivo) {
		this.pago_efectivo = pago_efectivo;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public int getNum_registros() {
		return num_registros;
	}

	public void setNum_registros(int num_registros) {
		this.num_registros = num_registros;
	}



	@Override
	public String toString() {
		return "Venta [id_venta=" + id_venta + ", id_pos=" + id_pos + ", vendedor=" + vendedor + ", folio=" + folio
				+ ", fecha_venta=" + fecha_venta + ", total_vendido=" + total_vendido + ", pago_efectivo="
				+ pago_efectivo + ", pago_cheque=" + pago_cheque + ", pago_vales=" + pago_vales + ", pago_tc=" + pago_tc
				+ ", supervisor=" + supervisor + ", upload=" + upload + ", num_registros=" + num_registros + "]";
	}
	
	
	
		
}
