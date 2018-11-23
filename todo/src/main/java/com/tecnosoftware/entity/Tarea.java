package com.tecnosoftware.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "tareas")
public class Tarea {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@NotNull
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "prioridad")
	private int prioridad;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "vencimiento")
	private Date vencimiento;
	@Column(name = "estado")
	private String estado;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "lista_id", nullable= false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Lista lista;


	public Tarea() {
		super();
	}

	public Tarea(int id, String titulo, int prioridad, String descripcion, Date vencimiento, String estado) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.prioridad = prioridad;
		this.descripcion = descripcion;
		this.vencimiento = vencimiento;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
