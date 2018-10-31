package com.tecnosoftware.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tecnosoftware.component.TareaConverter;
import com.tecnosoftware.entity.Tarea;
import com.tecnosoftware.model.TareaModel;
import com.tecnosoftware.repository.TareaRepository;
import com.tecnosoftware.service.TareaService;

@Service("tareaServiceImpl")
public class TareaServiceImpl implements TareaService {

	@Autowired
	@Qualifier("tareaRepository")
	private TareaRepository tareaRepository;

	@Autowired
	@Qualifier("tareaConverter")
	private TareaConverter tareaConverter;

	@Override
	public TareaModel agregarTarea(TareaModel tareaModel) {
		Tarea tarea = tareaRepository.save(tareaConverter.convertTareaModelToTarea(tareaModel));
		return tareaConverter.convertTareaToTareaModel(tarea);
	}

	@Override
	public List<TareaModel> listarTareas() {
		List<Tarea> tareas = tareaRepository.findAll();
		List<TareaModel> tareasModel = new ArrayList<TareaModel>();
		for (Tarea tarea : tareas) {
			tareasModel.add(tareaConverter.convertTareaToTareaModel(tarea));
		}
		return tareasModel;

	}

	@Override
	public Tarea buscarTareaPorId(int id) {
		return tareaRepository.findById(id);
	}

	public TareaModel buscarTareaPorIdModel(int id) {
		return tareaConverter.convertTareaToTareaModel(buscarTareaPorId(id));
	}

	@Override
	public void borrarTarea(int id) {
		Tarea tarea = buscarTareaPorId(id);
		if (null != tarea) {
			tareaRepository.delete(tarea);
		}

	}

	public List<Tarea> list() {
        return tareaRepository.findAll();
    }
}
