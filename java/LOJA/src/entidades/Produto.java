package entidades;

public class Produto {
	
	private String codigo;
	private String nome;
	private double valor;
	private int  estoque;
	public Produto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		
		
	}
	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}
	
	
	
	}


