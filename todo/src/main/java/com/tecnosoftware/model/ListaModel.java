package com.tecnosoftware.model;

import java.util.List;

public class ListaModel {

	private String titulo;
	public int id;
	private List<TareaModel> tareas;

	public ListaModel() {

	}

	public ListaModel(int id, String titulo, List<TareaModel> tareas) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.tareas = tareas;
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

	public List<TareaModel> getTareas() {
		return tareas;
	}

	public void setTareas(List<TareaModel> tareas) {
		this.tareas = tareas;
	}

}
