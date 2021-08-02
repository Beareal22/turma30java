programa
{
	inclua biblioteca Matematica-->mat
	inclua biblioteca Texto
	inclua biblioteca Tipos
	
	funcao inicio()
	{	
	cadeia mercadoria[10]={"ps5","ps4","Fifa","xbox X Series","Gta","controle PS5","Controle PS4","Cabo Hdmi","Controle PC","Teclado Gamer"}
     inteiro unidades [10] ={10,10,10,10,10,10,10,10,10,10}
     real preco [10] = {5000.20,2000.15,299.99,3000.50,245.45,200.99,140.99,129.01,130.99,140.99}
     cadeia continuar
     cadeia continuar2
     logico continua2 = verdadeiro
     inteiro codigo
     caracter pagamento = '0'
     real imposto
     inteiro qntd = 0
     cadeia comprador[2]
	inteiro x
	inteiro compras[10]
	real total = 0.0, parcelas = 0.0

	
     escreva("Bem Vindo a Smart Gamer!\n")
	 enquanto(continua2) {
		// Peça nome e cpf do cliente
		escreva("Digite seu nome: \n")
		leia(comprador[0])
		escreva("Digite seu CPF: \n")
		leia(comprador[1])
     	
		// Liste os produtos a disposição
		escreva("Temos os seguintes produtos a sua disposição:\n")
	  	para(x = 0 ; x < 10; x++){
			escreva("\n",x+1,"- ",mercadoria[x]," o valor do produto R$",mat.arredondar(preco[x],2), " em estoque ", unidades[x])
			escreva("\n")
		}
		escreva("\n")
		escreva("Nossos estoques contam com 10 unidades de cada produto. Boas Compras!")

       se ( cpf <= 11){
       	
       }
       
       
       senao
	      escreva  ("\nExcedente:")
	 }
	}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */