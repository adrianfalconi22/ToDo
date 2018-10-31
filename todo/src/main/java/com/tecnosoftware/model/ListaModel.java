package com.tecnosoftware.model;

import java.util.List;

public class ListaModel {

	private String titulo;
	private List<TareaModel> tareas;

	public ListaModel() {

	}

	public ListaModel(String titulo, List<TareaModel> tareas) {
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

	public List<TareaModel> getTareas() {
		return tareas;
	}

	public void setTareas(List<TareaModel> tareas) {
		this.tareas = tareas;
	}

}
