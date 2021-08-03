import java.util.Scanner;

public class Tarefa4 {
public  static void  main (String args[]) 
{
	Scanner leia = new  Scanner (System.in);
	
	double ValorA ;
	double ValorB;
	double ValorC;
	double ValorD;
	double ValorR;
	double ValorS;
	
	System.out.print("Digite o primeiro inteiro A:");
	ValorA=leia.nextDouble();
	System.out.print("Digite o segundo inteiro B:");
    ValorB=leia.nextDouble();
    System.out.print("Digite o terceiro inteiro C:");
	ValorC=leia.nextDouble();
	System.out.print("Digite  o quarto inteiro D:");
	ValorD=leia.nextDouble();
	System.out.print("Digite o quinto inteiro R:");
	ValorR=leia.nextDouble();
	System.out.print("Digite o sexto inteiro S:");
	ValorS=leia.nextDouble();
	
	ValorR = Math.pow((ValorA + ValorB), 2);

	
	ValorS = Math.pow((ValorB + ValorC), 2);
	
	ValorD = (ValorR + ValorS) / 2;
	
	System.out.print("Atribuindo as variáveis na fórmula, obtivemos o resultado de D igual a: "+ ValorD);

}
}
