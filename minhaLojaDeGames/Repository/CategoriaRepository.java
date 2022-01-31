package com.minhaLojaDeGames.minhaLojaDeGames.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaLojaDeGames.minhaLojaDeGames.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long>{
	
	public static List<Categoria> findAllByGeneroContainingIgnoreCase (String genero) {
		// TODO Auto-generated method stub
		return null;
	}

}
