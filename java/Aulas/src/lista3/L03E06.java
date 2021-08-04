package lista3;

import java.util.Scanner;

public class L03E06 {
	
	Scanner leia = new Scanner (System.in);
	
	int numero=0,contador =0;{
	
	do 
	{
		System.out.println("Digite o numero um numero inteiro : ");
		numero= leia.nextInt();
		
		if(numero % 3 ==0 && numero>=0) 
		{
			
			contador++;
		}
		
		System.out.println("A quantidade de repetição de multiplos de 3 é : " +contador);	
		
		
	}while (numero<10);
}
	
	
	
	
	
}
