package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PutMapping;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long>{

	
       public static List<Postagem> findAllByTituloContainingIgnoreCase (String titulo) {
		// TODO Auto-generated method stub
		return null;
	}
       
    
       
}
