package com.tecnosoftware.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnosoftware.entity.Tarea;

@Repository("tareaRepository")
public interface TareaRepository extends JpaRepository<Tarea, Serializable> {

	public abstract Tarea findById(int id);
}
