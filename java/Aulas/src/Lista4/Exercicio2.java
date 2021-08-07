package Classes;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
	
	public  String Aviao;
	public String codigo;
	public String campanhia;
	public int passageiros;
	public int tripulacao;
	public int modelo;
	public int totalPassageiros;
	
	Aviao exemplo1 = new Aviao();
	
	System.out.print("Digite o código da Aviao: ");
	exemplo1.codigo = leia.nextInt();
	System.out.print("Digite a companhia do  aviao: ");
	exemplo1.companhia = leia.next();
	System.out.print("Digite o modelo do  aviao: ");
	exemplo1.modelo = leia.next();
	System.out.print("Digite quantas pessoas são passageiros: ");
	exemplo1.passageiros = leia.nextInt();
	System.out.print("Digite quantas pessoas pertencem a tripulação: ");
	exemplo1.tripulacao = leia.nextInt();
	
	exemplo1.totalPassageiros();

}}
