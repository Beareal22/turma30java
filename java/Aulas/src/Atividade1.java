import java.util.Scanner;

public class Atividade1 {
 
	 public static void  main (String  args []) {
	
		 Scanner leia = new Scanner (System.in);
		 
		int x1,x2,x3;
		
		System.out.printf("Digite  o  valor de x1:");
		x1=leia.nextInt();
		System.out.printf("Digite o valor de x2:");
		x2= leia .nextInt();
		System.out.printf("Digite o valor de x3:");
		x3=leia.nextInt();
		if(x1>x2){		
	
		if(x1>x3) 
		{
			
			System.out.printf("O maior numero e:%d\n",x1);
			
		}
			
			else
			{
				System.out.printf("O maior  numero e:d%\n", x3);
					
			} 
		
		}
		else if (x2 < x3) {
			
				
				System.out.printf("O maior numero e: %d\n",x2);
		 }
		
        else
       {
            System.out.printf("O maior numero e: %d\n",x3);
				
			
		
		}
		}
	 }


		
			
			
		
		
		
		
	 


		
	
	 
	 

