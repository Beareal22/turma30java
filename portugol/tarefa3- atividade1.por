programa
{
	
	funcao inicio()
	{
		
		real habitante= 3
		real salario =  0
          real filhos=   0
          real somaSalario= 0
          real mediaSalario= 0
          real somaFilhos= 0
          real mediaFilhos= 0
          real maiorSalario= 0
          real percentualpessoas100=0

          para (inteiro x=1; x<= habitante; x= x+ 1)
          {
          	escreva ("Digite  numero  de filhos:")
          	leia(filhos)
          	escreva("Digite  o valor do salario:")
          	leia(salario)

          	somaSalario= somaSalario+ salario
          	somaFilhos= somaFilhos+ filhos

          	mediaSalario= somaSalario/habitante 
          	mediaFilhos= somaFilhos/habitante 

          	se ( salario> maiorSalario)
          	{
          		maiorSalario= salario
          	}
          	se (salario<= 100)
          	{
          		percentualpessoas100 = percentualpessoas100+1
          		
          	}
          }
          
          
		escreva("\nA media do salario da pupolação é :",mediaSalario)
		escreva("\nA media do numero de filhos é:",mediaFilhos)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 824; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */