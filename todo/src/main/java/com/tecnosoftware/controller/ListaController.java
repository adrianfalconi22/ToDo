package com.tecnosoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tecnosoftware.constants.ViewConstant;
import com.tecnosoftware.entity.Lista;
import com.tecnosoftware.repository.ListaRepository;
import com.tecnosoftware.service.ListaService;

@Controller
@RequestMapping("/listas")
public class ListaController {

	@Autowired
	@Qualifier("listaServiceImpl")
	private ListaService listaService;

	@Autowired
	@Qualifier("listaRepository")
	private ListaRepository listaRepository;

	@GetMapping("/mostrarlistas")
	public ModelAndView mostrarListas() {
		ModelAndView mav = new ModelAndView(ViewConstant.LISTAS);
		mav.addObject("listas", listaService.listarListas());
		return mav;

	}

	@PostMapping("/crearlista")
	public String crearLista(@ModelAttribute(name = "listaModel") Lista lista, Model model) {
		if (listaService.agregarLista(lista) != null) {
			model.addAttribute("result", 1);
		} else {
			model.addAttribute("result", 0);
		}
		return "redirect:/listas/mostrarlistas";
	}

	@GetMapping("/listasform")
	private String redirectTareasForm(@RequestParam(name = "id", required = false) int id, Model model) {

		Lista lista = new Lista();
		if (id != 0) {
			lista = listaService.buscarListaPorId(id);
		}
		model.addAttribute("listaModel", lista);
		return ViewConstant.LISTA_FORM;
	}

	@GetMapping("/borrarlista")
	public ModelAndView borrarlista(@RequestParam(name = "id", required = true) int id) {
		listaService.borrarlista(id);
		return mostrarListas();
	}
}
