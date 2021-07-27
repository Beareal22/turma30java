programa
{
	
	funcao inicio()
	{
		real a
		real b
		real c
		real d
		real e1
		real f
		real x
		real y
          real	x1
          real y1
          real auxiliar 

          escreva ("Digita sua nota a")
		leia ( a)
		escreva ("Digita sua  nota b")
		leia( b)
		escreva ("Digita sua nota c")
		leia( c )
          escreva ("Digita sua nota d")
		leia( d )
		escreva ("Digita sua nota e1")
		leia( e1 )
          escreva ("Digita sua  nota f")
		leia( f )


          x1=(c*e1)-( b*f)
          y1=(a*f)-(c*d)
          auxiliar = (a*e1)-(b*d)

          x=x1/auxiliar
          y=y1/auxiliar 

          escreva("x igual a" +x)
          escreva("y igual a" +y)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 257; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */