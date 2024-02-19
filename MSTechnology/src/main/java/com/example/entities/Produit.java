package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	private String nomProduit;
	private Double prixProduit;
	private String description;
	public Produit() {
	super();
	}
	public Produit(String nomProduit, Double prixProduit, String description) {
	super();
	this.nomProduit = nomProduit;
	this.prixProduit = prixProduit;
	this.description = description;
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
		public String getDescription() {
		return description;
		}
		public void setDateCreation(String description) {
		this.description = description;
		}
		@Override
		public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" +
		nomProduit + ", prixProduit=" + prixProduit
		+ ", dateCreation=" + description + "]";
		}

}
