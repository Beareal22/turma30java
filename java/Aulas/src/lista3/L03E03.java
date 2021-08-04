package lista3;

import java.util.Scanner;

public class L03E03 {
	public static void main(String[]args)
	{
		Scanner leia=new Scanner(System.in);
		int idade,menor21=0,maior50=0;
		
		System.out.println("Digite  sua idade :");
		idade=leia.nextInt();
		
		while(idade != -99) {
			if(idade<21) {
				menor21++;
			}
			
			else if(idade>50) {
				maior50++;
			}
			else {
				
			}
			
			System.out.println("Digite  sua idade :");
			idade=leia.nextInt();
			
		}
		
		System.out.printf("Quantidade de pessoas com  menor de 21 é: ",menor21);
		System.out.printf("Quantidade de pessoas com mais de 50 é:  " ,maior50);
	}
	

}
