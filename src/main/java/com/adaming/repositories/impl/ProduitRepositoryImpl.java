package com.adaming.repositories.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.adaming.models.Produit;
import com.adaming.repositories.ProduitRepository;

@Repository
@Transactional
public class ProduitRepositoryImpl implements ProduitRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Produit> findAll() {
		
		return em.createQuery("from Produit").getResultList();
	}

	public void deleteById(Long id) {
		em.remove(findById(id));
		
	}

	public Produit save(Produit produit) {
		
		return em.merge(produit);
	}

	public Produit findById(Long id) {
		
		return em.find(Produit.class, id);
	}

}
