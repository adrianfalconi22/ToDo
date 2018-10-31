package com.tecnosoftware.component;

import org.springframework.stereotype.Component;

import com.tecnosoftware.entity.Tarea;
import com.tecnosoftware.model.TareaModel;

@Component
public class TareaConverter {

	public Tarea convertTareaModelToTarea(TareaModel tareaModel) {
		Tarea tarea = new Tarea();
		tarea.setTitulo(tareaModel.getTitulo());
		tarea.setDescripcion(tareaModel.getDescripcion());
		tarea.setEstado(tareaModel.getEstado());
		tarea.setPrioridad(tareaModel.getPrioridad());
		tarea.setVencimiento(tareaModel.getVencimiento());
		return tarea;
	}

	public TareaModel convertTareaToTareaModel(Tarea tarea) {
		TareaModel tareaModel = new TareaModel();
		tareaModel.setId(tarea.getId());
		tareaModel.setTitulo(tarea.getTitulo());
		tareaModel.setDescripcion(tarea.getDescripcion());
		tareaModel.setEstado(tarea.getEstado());
		tareaModel.setPrioridad(tarea.getPrioridad());
		tareaModel.setVencimiento(tarea.getVencimiento());
		return tareaModel;

	}
}
