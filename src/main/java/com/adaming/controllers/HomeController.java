package com.adaming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adaming.models.Categorie;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String honePage(Model model) {
		model.addAttribute("titre", "Ma page Accueil");
		model.addAttribute("categorie", new Categorie());
		return "index";
	}
}
