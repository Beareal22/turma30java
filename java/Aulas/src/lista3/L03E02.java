package lista3;

import java.util.Scanner;

  public class L03E02 {
 public static void main(String[]args) {
		 
	Scanner leia=new Scanner(System.in);
	
 int numero,impar=0,par = 0;
 
 
for (int x=1; x<=10; x++) {
	System.out.println("Digite o numero:");
	
	numero= leia.nextInt();
	if(numero%2==0) {
		par++;
	}
	
}
   impar=10;
   
   System.out.printf("Quantidade de pares %d ",par);
   System.out.printf("Quantidade de impares %d ",impar);
}

}
