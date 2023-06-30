package com.generation.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojadegames.model.Categoria;
import com.generation.lojadegames.model.Produto;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
