package entities;

public class Pet {
  
	private String raca;
	private char  porte;
	private int  anoNascimento;
	
	public Pet(String raca) {
		super();
		this.raca = raca;
	}

	public Pet(String raca, int idade) {
		super();
		this.raca = raca;
		this.anoNascimento = anoNascimento;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public char getPorte() {
		return porte;
	}

	public void setPorte(char porte) {
		this.porte = porte;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public void emiteSom() {
		System.out.println("Emitindo o som do bicho.....");
	}

	public void som() {
		System.out.println("Som do animal");
	}

	public void somAlto() {
		System.out.println("Som alto do animal");
	}

	public void somBaixo() {
		System.out.println("Som baixo do animal");
	}
}