package com.adaming.services;

import java.util.List;

import com.adaming.models.Categorie;

public interface CategorieService {
	
	public Categorie save(Categorie categorie);
	
	public List<Categorie> findAll();
	
	public Categorie findById(Long id);
	
	public void deleteById(Long id);
}
