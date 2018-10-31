package com.tecnosoftware.model;

import java.util.List;

public class UsuarioModel {

	private int id;
	private String nombre;
	private String mail;
	private String password;
	private List<ListaModel> listas;

	public UsuarioModel() {

	}

	public UsuarioModel(int id, String nombre, String mail, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.mail = mail;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<ListaModel> getListas() {
		return listas;
	}

	public void setListas(List<ListaModel> listas) {
		this.listas = listas;
	}

}
