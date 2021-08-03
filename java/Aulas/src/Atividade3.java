
import java.util.Scanner;

//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto


public class Atividade3 {
	
	 public static void  main (String  args []) {
			
		 Scanner leia = new Scanner (System.in);
		 
		 int idade ;
		 
		 System.out.printf("Digite a idade :");
		 idade=leia.nextInt();
		 
		 if (idade >=10 && idade <=14)
		 {
			 System.out.println("sua categoria e infantil ");
		 }
		 
		 else if(idade>=15 && idade<=17)
		 {
			 System.out.println(" sua categoria e juvenil");
		 }
		 else {
			 
			 System.out.println("sua categoria e adulto");
		 }
		 
		
		  
		 
		 
	 }
		 
}
