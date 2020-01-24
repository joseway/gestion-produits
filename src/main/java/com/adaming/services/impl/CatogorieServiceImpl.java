package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.models.Categorie;
import com.adaming.repositories.CategorieRepository;
import com.adaming.services.CategorieService;

@Service
public class CatogorieServiceImpl implements CategorieService{

	@Autowired
	private CategorieRepository categorieRepository;
	
	public Categorie save(Categorie categorie) {
		
		return categorieRepository.save(categorie);
	}

	public List<Categorie> findAll() {
		
		return categorieRepository.findAll();
	}

	public Categorie findById(Long id) {
		
		return categorieRepository.findById(id);
	}

	public void deleteById(Long id) {
		categorieRepository.deleteById(id);
		
	}

}
