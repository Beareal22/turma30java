programa
{
	
	funcao inicio()
	{
		cadeia codigo
		inteiro horasTrabalhadas=0
		inteiro excessoHoras=0
		real salarioTotal=0.00
		real salariioExcedente=0.00
		const real VALOR_HORA_NORMAL= 10.00
		const real  valorHorasExcedente= 20.00
		const inteiro LIMITE_HORAS = 50

	
		escreva("Digite o numero de horas trabalhadas  :")
		leia(horasTrabalhadas)
		escreva("Digite o numero de salarioTotal  :")
		leia(salarioTotal)
          escreva("Digite o valorHorasexcedente:")

		se(horasTrabalhadas <= LIMITE_HORAS){
			salarioTotal=horasTrabalhadas * VALOR_HORA_NORMAL
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 48; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */