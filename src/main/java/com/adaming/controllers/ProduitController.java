package com.adaming.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	@RequestMapping(value="", method=RequestMethod.POST)
	public String saveProduit(@ModelAttribute("produit")Produit produit) {
		System.out.println("Cat Nom: " + produit.getCategorie().getNom());
		System.out.println("Cat Nom: " + produit.getCategorie().getId());
		System.out.println("Cat Prod: " + produit.getNom());
		
		Long catId = Long.parseLong(produit.getCategorie().getNom());
		Categorie prodCat = categorieService.findById(catId);
		produit.setCategorie(prodCat);
		
		produitService.save(produit);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/{id}")
	public String findById(@PathVariable("id")Long id, Model model) {
		Produit prod = produitService.findById(id);
		model.addAttribute("produit", prod);
		return "produit";
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String update(@PathVariable("id")Long id, Model model) {
		model.addAttribute("categories", categorieService.findAll());
		Produit prod = produitService.findById(id);
		
		model.addAttribute("produit", prod);
		
		System.out.println("Prod cat nom: " + prod.getCategorie().getNom());
		System.out.println("Prod cat id: " + prod.getCategorie().getId());
		
		return "updateProduit";
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.POST)
	public String update(@ModelAttribute("produit")Produit produit) {
		produitService.save(produit);
		
		return "redirect:/produits";
	}
	@RequestMapping(value="/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		produitService.deleteById(id);
		
		return "redirect:/";
	}
}
