package com.adaming.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.models.Categorie;
import com.adaming.services.CategorieService;

@Controller
public class CategorieController {
	
	@Autowired
	private CategorieService categorieService;

	@RequestMapping(value="/categories", method=RequestMethod.POST)
	public String saveCategorie(@ModelAttribute("categorie") Categorie categorie) {
		//Enregistre la cat sur la BD
		
		categorieService.save(categorie);
		
		return "redirect:/";
	}
}
