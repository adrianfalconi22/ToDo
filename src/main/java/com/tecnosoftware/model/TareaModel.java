package com.tecnosoftware.model;

import java.util.Date;

public class TareaModel {

	private String titulo;
	private int prioridad;
	private String descripcion;
	private Date vencimiento;
	private String estado;
	private int id;

	public TareaModel() {

	}

	public TareaModel(int id, String titulo, int prioridad, String descripcion, Date vencimiento, String estado) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.prioridad = prioridad;
		this.descripcion = descripcion;
		this.vencimiento = vencimiento;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "TareaModel [titulo=" + titulo + ", prioridad=" + prioridad + ", descripcion=" + descripcion
				+ ", vencimiento=" + vencimiento + ", estado=" + estado + ", id=" + id + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
