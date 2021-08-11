package entities;

import  entities.funcionario;

import  entities.Terceiro;

public class TesteFuncionario {
	
	public static void main(String[]args) {
		
		Terceiro f1= new terceiro("001",50.0,20.0);
		
		funcionario f2= new funcionario ("002",90, 40.0);
		
		System.out.println("Salario"+ f1.salario());
	}
	

}