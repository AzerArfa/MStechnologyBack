package com.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}