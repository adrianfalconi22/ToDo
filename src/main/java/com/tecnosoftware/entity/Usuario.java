//package com.tecnosoftware.entity;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "usuario")
//public class Usuario {
//
//	@Id
//	@GeneratedValue
//	@Column(name = "id")
//	private int id;
//	@Column(name = "nombre")
//	private String nombre;
//	@Column(name = "mail")
//	private String mail;
//	@Column(name = "password")
//	private String password;
//	@Column(name = "listas")
//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "lista")
//	private Set<Lista> listas = new HashSet<Lista>();
//
//	public Usuario() {
//
//	}
//
//	public Usuario(int id, String nombre, String mail, String password) {
//		super();
//		this.id = id;
//		this.nombre = nombre;
//		this.mail = mail;
//		this.password = password;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public String getMail() {
//		return mail;
//	}
//
//	public void setMail(String mail) {
//		this.mail = mail;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public Set<Lista> getLista() {
//		return listas;
//	}
//
//	public void setLista(Set<Lista> lista) {
//		this.listas = lista;
//	}
//
//}
