package com.adaming.repositories;

import java.util.List;

import com.adaming.models.Produit;

public interface ProduitRepository {
	
	public List<Produit> findAll();
	
	public void deleteById(Long id);
	
	public Produit save(Produit produit);
	
	public Produit findById(Long id);
}
