package com.tecnosoftware.service;

import java.util.List;

import com.tecnosoftware.entity.Tarea;
import com.tecnosoftware.model.TareaModel;

public interface TareaService {

	public abstract TareaModel agregarTarea(TareaModel tareaModel);

	public abstract List<TareaModel> listarTareas();

	public abstract Tarea buscarTareaPorId(int id);

	public abstract void borrarTarea(int id);

	public TareaModel buscarTareaPorIdModel(int id);

	public abstract List<Tarea> list();

}
