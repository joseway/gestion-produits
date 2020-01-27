package com.adaming.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adaming.models.Categorie;
import com.adaming.models.Produit;
import com.adaming.services.CategorieService;
import com.adaming.services.ProduitService;

@Controller
public class HomeController {

	@Autowired
	private CategorieService categoryService;
	
	@Autowired	
	private ProduitService produitService;
	
	@RequestMapping(value= {"/", "home"})
	public String honePage(Model model) {
		model.addAttribute("produit", new Produit());
		model.addAttribute("titre", "Ma page Accueil");
		model.addAttribute("categorie", new Categorie());
		
		model.addAttribute("categories", categoryService.findAll());
		model.addAttribute("produits", produitService.findAll());
		
		return "index";
	}
}
