package com.tecnosoftware.service;

import java.util.List;

import com.tecnosoftware.entity.Lista;

public interface ListaService {
	public abstract List<Lista> listarListas();

	public abstract Lista buscarListaPorId(int id);

	public abstract void borrarlista(int id);

	public abstract Lista agregarLista(Lista lista);

}
