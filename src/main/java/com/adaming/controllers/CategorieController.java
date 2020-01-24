package com.adaming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.models.Categorie;

@Controller
public class CategorieController {

	@RequestMapping(value="/categories", method=RequestMethod.POST)
	public String saveCategorie(@ModelAttribute("categorie") Categorie categorie) {
		//Enregistre la cat sur la BD
		
		
		return "redirect:/";
	}
}
