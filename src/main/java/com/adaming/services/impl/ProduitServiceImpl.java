package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.models.Produit;
import com.adaming.repositories.ProduitRepository;
import com.adaming.services.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService{

	@Autowired
	private ProduitRepository produitRepository;
	
	public List<Produit> findAll() {
		
		return produitRepository.findAll();
	}

	public void deleteById(Long id) {
		
		produitRepository.deleteById(id);
	}

	public Produit save(Produit produit) {
		
		return produitRepository.save(produit);
	}

	public Produit findById(Long id) {
		
		return produitRepository.findById(id);
	}

}
