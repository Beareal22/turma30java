package com.LojaDeGames.Game.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Produto")

public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	
	@NotNull
	@Size(min=5,max=50)
	private String modelo;
	
	@NotNull
	@Size(min=2,max=6)
	
    private  String Console;
	
	@NotNull
	@Size(min=10,max=500)
	private  String Cdjogos;
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getConsole() {
		return Console;
	}


	public void setConsole(String console) {
		Console = console;
	}


	public String getCdjogos() {
		return Cdjogos;
	}


	public void setCdjogos(String cdjogos) {
		Cdjogos = cdjogos;
	}


}

