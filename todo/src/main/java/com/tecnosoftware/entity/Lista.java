package com.tecnosoftware.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "listas")
public class Lista {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@NotNull
	@Column(name = "titulo")
	private String titulo;

	@Column(name = "tareas")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "lista")
	private Set<Tarea> tareas = new HashSet<Tarea>();

	public Lista() {

	}

	public Lista(String titulo, Set<Tarea> tareas) {
		super();
		this.titulo = titulo;
		this.tareas = tareas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Set<Tarea> getTarea() {
		return tareas;
	}

	public void setTarea(Set<Tarea> tarea) {
		this.tareas = tarea;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}
