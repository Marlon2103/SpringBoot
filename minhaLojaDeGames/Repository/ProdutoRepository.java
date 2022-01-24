package com.minhaLojaDeGames.minhaLojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.minhaLojaDeGames.minhaLojaDeGames.Model.Produto;



public interface ProdutoRepository extends JpaRepository<Produto,Long>{
	
	
	public static List<Produto> findAllByTituloContainingIgnoreCase (String nome) {
		// TODO Auto-generated method stub
		return null;
	}


}
