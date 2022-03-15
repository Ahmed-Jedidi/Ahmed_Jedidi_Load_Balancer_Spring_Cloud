package com.ahmed.produits.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //persistance Data
public class Produit {

	@Id  //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	private Long idProduit;
	private String nomProduit;
	private Double prixProduit;
	private Date dateCreation;

	public Produit() {
		super();
	}

	public Produit(String nomProduit, Double prixProduit, Date dateCreation) {
		super();
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.dateCreation = dateCreation;
	}
	
	public Produit(String nomProduit, Double prixProduit) {
		super();
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.dateCreation = new Date();
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public Double getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(Double prixProduit) {
		this.prixProduit = prixProduit;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" +

				nomProduit + ", prixProduit=" + prixProduit

				+ ", dateCreation=" + dateCreation + "]";

	}

}


