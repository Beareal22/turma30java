import java.util.Scanner;

public class Tarefa5 {
public  static void  main (String args[]) 
{
	Scanner leia = new  Scanner (System.in);
	
	double nota1;
	double nota2;
	double nota3;
	double Valor1;
	double Valor2;
	double Valor3;
	double Valormedia ; 
	
	  System.out.print("Insira a nota da  primeira prova:");
	  nota1=leia.nextDouble();
	  System.out.print("Insira a nota da segunda prova:");
	  nota2=leia.nextDouble();
	  System.out.print("Insira a nota da terceira prova:");
	  nota3=leia.nextDouble();
	  
	    Valor1 = nota1 * 0.2;
		Valor2 = nota2 * 0.3;
		Valor3 = nota3 * 0.5;
		Valormedia = Valor1 + Valor2 + Valor3;
		
	  
	 System.out.print("a media do estudante é igual a:"+Valormedia);
	 
	 
}    
}