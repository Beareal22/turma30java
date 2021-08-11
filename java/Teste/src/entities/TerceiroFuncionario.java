package entities;

public class Terceiro extends Funcionario {
	
	private double adicional;

	public Terceiro(String matricula, int horasTrabalhadas, double valorPorHoras, double adicional) {
		super(matricula, horasTrabalhadas, valorPorHoras);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public double salario() {
		return ((getHorasTrabalhadas()*getValorPorHoras()) + this.adicional );
	}

	private int getValorPorHoras() {
		
		return 0;
	}

}


