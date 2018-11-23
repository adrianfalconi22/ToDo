package com.tecnosoftware.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tecnosoftware.entity.Lista;
import com.tecnosoftware.repository.ListaRepository;
import com.tecnosoftware.service.ListaService;

@Service("listaServiceImpl")
public class ListaServiceImpl implements ListaService {

	@Autowired
	@Qualifier("listaRepository")
	private ListaRepository listaRepository;

	@Override
	public List<Lista> listarListas() {
		return listaRepository.findAll();

	}

	@Override
	public Lista agregarLista(Lista lista) {
		return listaRepository.save(lista);
	}

	@Override
	public Lista buscarListaPorId(int id) {
		return listaRepository.findById(id);

	}

	@Override
	public void borrarlista(int id) {
		Lista lista = buscarListaPorId(id);
		if (null != lista) {
			listaRepository.delete(lista);
		}

	}

}
