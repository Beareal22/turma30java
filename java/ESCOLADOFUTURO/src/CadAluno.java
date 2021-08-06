package programas;

import java.util.Scanner;

public class CadAlunos {
	final int QNTD_ALUNOS=3;
	
	Scanner leia = new Scanner(System.in);
			final int QNTD_ALUNOS1=3;
			final String NOME[] = {"Rodrigo","Roseo","teste","abcd"};
			String matricula[] = new String[NOME.length];
			int nota[] = new int[NOME.length]; //MAT-0X
			boolean ativo[] = new boolean[NOME.length]; //começa true
			String matriculaDigitada="";
			int aluneSelecionade=0;
			
			for(int i=0;i<NOME.length;i++) {
				matricula[i] = "MAT-0"+(i+1);
			}
			
			// Mostrar todo mundo
			for(int i=0;i<NOME.length;i++) {
				if((i % 3 == 0) && (i != 0)) {
					System.out.printf("%s\n",NOME[i]);
				} else {
					System.out.printf("%s | ",NOME[i]);
					
					
				}
			}
			//pedir pela matricula
			System.out.printf("");
			matriculaDigitada = leia.next();
			for(int i1=0;i<NOME.length;i++) {
				if(matriculaDigitada == matricula[i]) {
					aluneSelecionade = i;
					break;
					//GERADOR DE CÓDIGOS
					for (int x = 0; x < 3; x ++)
					{
						matricula [x] = "MAT-" + (x + 1);
						nota [x] = 0;
						situacao [x] = "?";
					}
					
					//PROCESSAMENTOS E SAÍDAS
					do
					{
						for (int x = 0; x < 3; x ++)
						{
							System.out.printf("%s\t%s\t    %d\t%s\n", matricula [x], nome [x], nota [x], situacao [x]);
						}
						
						System.out.print("\nDIGITE A MATRÍCULA DESEJADA: ");
						auxMat = leia.next().toUpperCase();
						
						for (int x = 0; x < 3; x ++)
						{
							if (auxMat.equals(matricula [x]))
							{
								System.out.print("DIGITE A NOTA DO ALUNE: ");
								auxNota = leia.nextInt();
								System.out.print("DIGITE 'S' PARA ALUNE ATIVE OU 'N' PARA INATIVE: ");
								op = leia.next().toUpperCase().charAt(0);
								
								if (op == 'S')
								{
									nota [x] = auxNota;
									situacao [x] = "ATIVO";
									System.out.printf("%s\t%s\t%d\t%s", matricula [x], nome [x], nota [x], situacao [x]);					
								}
								else
								{	
									situacao [x] = "INATIVO";
									nota [x] = auxNota;
									System.out.printf("%s\t%s\t%d\t%s", matricula [x], nome [x], nota [x], situacao [x]);
								}
								
							}
						}
						
						System.out.print("\nDESEJA CONTINUAR? DIGITE 'S' PARA SIM E 'N' PARA NÃO: ");
						op = leia.next().toUpperCase().charAt(0);
						
					}
					while (op == 'S');
					
					
				}
			}


}
}

