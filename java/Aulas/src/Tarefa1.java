import java.util.Scanner;

public class Tarefa1 {
public  static void  main (String args[]) 
{
	Scanner leia = new  Scanner (System.in);
	int anos,meses,dias, tdia,tanos,tmeses;
	
	System.out.println("anos:");
	anos =leia.nextInt();
	System.out.println("meses");
	meses =leia.nextInt();
	System.out.println("dias");
	dias=leia.nextInt();
	
				tanos= anos*365;
				tmeses=meses * 30;
				tdia=tanos+tmeses+dias;
				
				System.out.println(tdia);
}

}
