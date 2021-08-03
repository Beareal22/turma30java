import java.util.Arrays;
import java.util.Scanner;

public class Atividadee2 {
	
	public static void  main (String  args [])  {
		int[] listaDeNumeros = new int[4];
		int[] numeros = new int[4];
		Scanner numeros1 = new Scanner(System.in);
		
		for (int i = 1; i < listaDeNumeros.length; i++) {
			System.out.print("Digite " + i + "° numeros: ");
			listaDeNumeros[i] = (numeros1.nextInt());
		}

	
		Arrays.sort(listaDeNumeros);

		
		System.out.print("Ordem crescente:    ");
		for (int j = 1; j < listaDeNumeros.length; j++) {
			System.out.print(listaDeNumeros[j] + "  ");
	}
		}
	}
	
		
		
