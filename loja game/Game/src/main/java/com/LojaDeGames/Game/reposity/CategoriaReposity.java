package com.LojaDeGames.Game.reposity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojaDeGames.Game.model.Categoria;
import com.LojaDeGames.Game.model.Produto;

public interface CategoriaReposity extends JpaRepository<Produto,Long> {
	
	public List<Categoria> findAllByGeneroContainingIgnoreCase(String tipo);

	
}
