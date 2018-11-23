package com.tecnosoftware.component;

import org.springframework.stereotype.Component;

import com.tecnosoftware.entity.Lista;
import com.tecnosoftware.model.ListaModel;

@Component
public class ListaConverter {

	public Lista convertListaModelToLista(ListaModel listaModel) {
		Lista lista = new Lista();
		lista.setId(listaModel.getId());
		lista.setTitulo(listaModel.getTitulo());

		return lista;
	}

	public ListaModel convertListaToListaModel(Lista lista) {
		ListaModel listaModel = new ListaModel();
		listaModel.setId(lista.getId());
		listaModel.setTitulo(lista.getTitulo());
		return listaModel;

	}

}
