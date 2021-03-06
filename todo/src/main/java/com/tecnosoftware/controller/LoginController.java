package com.tecnosoftware.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tecnosoftware.constants.ViewConstant;

@Controller
public class LoginController {

	private static final Log LOG = LogFactory.getLog(LoginController.class);

//	@GetMapping("/")
//	public String redirectToLogin() {
//		LOG.info("Metho: redirectToLogin()");
//		return "redirect:/login";
//	}

	@GetMapping("/login")
	public String showLoginForm(Model model,
			@RequestParam(name = "error", required = false) String error,
			@RequestParam(name = "logout", required = false) String logout) {
		LOG.info("Method: showLoginForm()-- params: error=" + error + "logout=" + logout);
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		LOG.info("returning to login view");
		return ViewConstant.LOGIN;

	}

	@GetMapping({"/loginsucces", "/" })
	public String loginCheck() {
		LOG.info("method: loginCheck()");
		LOG.info("returning listas");
		return "redirect:/listas/mostrarlistas";

	}
//	@PostMapping("/logincheck")
//	public String loginCheck(@ModelAttribute(name = "userCredentials") UserCredential userCredential) {
//		LOG.info("Method: showLoginForm()-- params:" + userCredential.toString());
//		if (userCredential.getUsername().trim().equals("user") && userCredential.getPassword().trim().equals("user")) {
//			LOG.info("returning to contacts view");
//			return "redirect:/contacts/showcontacts";
//
//		}
//		LOG.info("redirect redirect:/login?error");
//		return "redirect:/login?error";
//	}
}
