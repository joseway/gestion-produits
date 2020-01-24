package com.adaming.repositories.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.adaming.models.Categorie;
import com.adaming.repositories.CategorieRepository;

@Repository
public class CategorieRepositoryImpl implements CategorieRepository{

	@PersistenceContext
	private EntityManager em;
	
	public Categorie save(Categorie categorie) {
		
		return em.merge(categorie);
	}

	@SuppressWarnings("unchecked")
	public List<Categorie> findAll() {		
		return em.createQuery("from Categorie").getResultList();
	}

	public Categorie findById(Long id) {
		
		return em.find(Categorie.class, id);
	}

	public void deleteById(Long id) {
		em.remove(findById(id));
		
	}

	
}
