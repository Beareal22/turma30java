programa
{
	inclua biblioteca Matematica-->mat
	inclua biblioteca Texto
	inclua biblioteca Tipos
	
	funcao inicio()
	{	
	cadeia mercadoria[10]={"Playstation5","Playstation4","FifaUltimate","  XboxOne   ","    Gta     ","Controle PS5","Controle PS4"," Cabo Hdmi  ","Controle PC ","TecladoGamer"}
     inteiro unidades [10] ={10,10,10,10,10,10,10,10,10,10}
     real preco [10] = {5000.20,2000.10,299.99,3000.50 ,245.49 ,200.99,140.99,129.01,130.99,140.99}
     cadeia codProduto[10]={"G1","G2","G3","G4","G5","G6","G7","G8","G9","GX"}
     cadeia continuar
     cadeia continuar2
     logico continua2 
     inteiro codigo
     caracter pagamento = '0'
     real imposto
     inteiro qntd = 0
     inteiro comprador[2]
     cadeia nomeComprador
	inteiro x
	inteiro compras[10]
	real total = 0.0, parcelas = 0.0
	caracter op = 'N'
	caracter op1 = 'S'
     escreva("Bem Vindo a Smart Gamer!\n")
	 
		// Peça nome e cpf do cliente
		escreva("Digite seu nome: ")
		leia(nomeComprador)
		escreva("Deseja fazer compras S/N: ")
		
		enquanto (op == 'N' ou op == 'n') {
			leia(op)
			se(op == 'S' ou op == 's')
			{
				escreva("Temos os seguintes produtos a sua disposição:\n")
				
			}senao
			{
				escreva("Até breve:\n")
				limpa()
				escreva("Deseja fazer compras S/N: ")
				
			}
			
	 	}
	 	limpa()
	 	escreva("Bem Vindo a Smart Gamer!\n")
	 	escreva("\n")
	 	//SLOGAN APARECENDO
	 	escreva("Temos os seguintes produtos a sua disposição:\n")
	 	
		//limpa()
		//Se cpf < 11 digitos
		//escreva("Digite um cpf válido") 
		
	 
		// Liste os produtos a disposição
		escreva("\nCOD","  ","  PRODUTO  ","  ","  VALOR  ","  ","ESTOQUE")
	  	para(x = 0 ; x < 10; x++){
			//escreva("\n",x+1,"- ","o código ",codProduto[x]," é: ",mercadoria[x]," o valor do produto R$",mat.arredondar(preco[x],2), " em estoque: ", unidades[x])
			//escreva("\n")
			
			escreva("\n",codProduto[x]," | ",mercadoria[x]," | ",mat.arredondar(preco[x],2)," | ", unidades[x])
		}
		escreva("\n")
		escreva("Nossos estoques contam com 10 unidades de cada produto. Boas Compras!")
		escreva("\nEscreva o produto selecionado: ")
		leia(mercadoria[x])
	 	escreva("\nQuantos unidades deseja?: ")
	 	leia(unidades[x])
	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2193; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */