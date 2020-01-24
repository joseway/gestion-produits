package com.adaming.repositories;

import java.util.List;

import com.adaming.models.Categorie;

public interface CategorieRepository {
	public Categorie save(Categorie categorie);
	
	public List<Categorie> findAll();
	
	public Categorie findById(Long id);
	
	public void deleteById(Long id);
}
