programa
{
	
	funcao inicio()
	{
		real P , E=0 , M= 0

		escreva ( "Digite o peso do tomate (em kg ): " )
		leia (P)
		limpa()

		se (P <= 50) {
			escreva ( "você comprou ", P, "kg de tomate ")
			escreva ( "Excedente :", E,"kg")
			escreva ("Multa : R$ ", M)
			
		}
	senao 
		escreva("Você comprou ", P, "kg de tomate")
		escreva  ("\nExcedente:", E, "kg")
		escreva ("\n Multa : R$ ", M)
		
	  }
	
	}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */