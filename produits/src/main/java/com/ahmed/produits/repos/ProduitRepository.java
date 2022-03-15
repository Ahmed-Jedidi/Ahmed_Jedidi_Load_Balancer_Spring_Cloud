package com.ahmed.produits.repos;

import java.util.List;

//JpaRepository dispose ALL THE NECESSARY OPERATION  FOR DATA (CRUD)
//param are the ENTITY and the type of its Primary key
import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

	List<Produit> findByNomProduit(String nomProduit);
	List<Produit> findByNomProduitContains(String nomProduit);
	

}
