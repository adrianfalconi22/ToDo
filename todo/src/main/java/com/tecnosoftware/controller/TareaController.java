package com.tecnosoftware.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
import com.tecnosoftware.model.TareaModel;
import com.tecnosoftware.service.TareaService;

@Controller
//@RestController
@RequestMapping("/tareas")
public class TareaController {

	private static final Log LOG = LogFactory.getLog(TareaController.class);

	@Autowired
	@Qualifier("tareaServiceImpl")
	private TareaService tareaService;

	@GetMapping("/tareasform")
	private String redirectTareasForm(@RequestParam(name = "id", required = false) int id, Model model) {

		TareaModel tarea = new TareaModel();
		LOG.info("Metodo: redirectTareasForm() -- Params: " + tarea.toString());
		if (id != 0) {
			tarea = tareaService.buscarTareaPorIdModel(id);
		}
		model.addAttribute("tareaModel", tarea);
		LOG.info("Metodo: redirectTareasForm() -- Params: " + tarea.toString());
		return ViewConstant.TAREA_FORM;
	}

	@PostMapping("/agregartarea")
	public String agregarTarea(@ModelAttribute(name = "tareaModel")@Valid TareaModel tareaModel, Model model) {
		LOG.info("Metodo: agregarTarea() -- Params: " + tareaModel.toString());
		if (tareaService.agregarTarea(tareaModel)!= null) {
			model.addAttribute("result", 1);
		} else {
 			model.addAttribute("result", 0);
		}
		return "redirect:/tareas/mostrartareas";

	}

	
	@GetMapping("/mostrartareas")
	public ModelAndView mostrarTareas() {
		ModelAndView mav = new ModelAndView(ViewConstant.TAREAS);
		mav.addObject("tareas", tareaService.listarTareas());
		return mav;

	}

	@GetMapping("/borrartarea")
	public ModelAndView borrarTarea(@RequestParam(name = "id", required = true) int id) {
		LOG.info("Metodo borrarTarea" + Thread.currentThread().getStackTrace()[2].getMethodName());
		tareaService.borrarTarea(id);
		return mostrarTareas();
	}

	//prueba con rest
//	@RequestMapping("/list")
//    public List<Tarea> list() {
//        return tareaService.list();
//    }
}
