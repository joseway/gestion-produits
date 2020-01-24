package com.adaming.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adaming.models.Categorie;
import com.adaming.models.Produit;
import com.adaming.services.CategorieService;
import com.adaming.services.ProduitService;

@Controller
@RequestMapping(value="/produits")
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@Autowired
	private CategorieService categorieService;

	@RequestMapping(value="")
	public String saveProduit(@ModelAttribute("produit")Produit produit) {
		System.out.println("Cat Nom: " + produit.getCategorie().getNom());
		
		Long catId = Long.parseLong(produit.getCategorie().getNom());
		Categorie prodCat = categorieService.findById(catId);
		produit.setCategorie(prodCat);
		
		
		produitService.save(produit);
		
		return "redirect:/";
	}
	
}
