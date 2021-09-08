package com.LojaDeGames.Game.reposity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojaDeGames.Game.model.Produto;

public interface ProdutoReposity extends JpaRepository<Produto,Long> {
	
	public List<Produto>FindAllByModeloContainingIgnoreCase(String modelo);

}
