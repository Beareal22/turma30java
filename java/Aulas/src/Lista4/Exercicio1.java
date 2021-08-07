package lista4;

import java.util.Scanner;

public class Exercicio1Cliente {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
		System.out.print("Digite o nome do cliente: ");
		cliente1.nome = ler.next();
		System.out.print("Digite o código do cliente: ");
		cliente1.codigo = ler.nextInt();
		System.out.print("Digite o ano de nascimento do cliente: ");
		cliente1.anoNascimento = ler.nextInt();
		
		System.out.println("Nome: "+cliente1.nome);
		System.out.println("Código: "+cliente1.codigo);
		cliente1.calculoIdade();
		
	}

}



	
	