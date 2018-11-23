package com.tecnosoftware.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnosoftware.entity.Lista;

@Repository("listaRepository")
public interface ListaRepository extends JpaRepository<Lista, Serializable> {

	public abstract Lista findById(int id);

}
