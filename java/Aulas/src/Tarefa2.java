import java.util.Scanner;

public class Tarefa2 {
	public static void  main (String args[]) 
	{
		Scanner leia = new Scanner (System.in);
		int anos,meses,dia,Diasvivido,Tanos,Tmeses;
		 System.out.println("Digite Numero de dias :");
		  Diasvivido = leia.nextInt();
		  
		  
		           Tanos= Diasvivido/365;
		           Tmeses=Diasvivido% 365/30;
		           dia= 365% 30% 30;
		           
		             System.out.println("Você tem:" + Tanos);
		             System.out.println("\nMeses:"+ Tmeses);
		             System.out.println("\n Dias"+ dia);
		             
		                  
	}
	
	
	

}
