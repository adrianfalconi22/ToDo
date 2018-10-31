//package com.tecnosoftware.entity;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//public class Lista {
//
//	@Id
//	@GeneratedValue
//	@Column(name = "id")
//	private int id;
//	@Column(name = "titulo")
//	private String titulo;
//	@Column(name = "tareas")
//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "lista")
//	private Set<Tarea> tareas = new HashSet<Tarea>();
//
//	public Lista() {
//
//	}
//
//	public Lista(String titulo, List<Tarea> tareas) {
//		super();
//		this.titulo = titulo;
//	}
//
//	public String getTitulo() {
//		return titulo;
//	}
//
//	public void setTitulo(String titulo) {
//		this.titulo = titulo;
//	}
//
//	public Set<Tarea> getTarea() {
//		return tareas;
//	}
//
//	public void setTarea(Set<Tarea> tarea) {
//		this.tareas = tarea;
//	}
//
//}
