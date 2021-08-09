package Gamer;

public class Projeto {
	
	imposto = total * 0.09
	
 System.out.println("O valor total de sua compra foi: R$ " + total + " e R$ " + imposto + " de impostos\n");
 System.out.println("Opções de pagamento: ");
 system.out.println("\"\\n1 - Á vista em dinheiro ou cheque(20% de desconto)\"");
 system.out.println("\n3 - Em duas vezes(sem desconto)");
 system.out.println("\n4 - 3x no cartão (10% de juros)\n");
 
 do{
 
 System.out.print("Digite a forma de pagamento\n");
 pagamento=leia.nextInt();
 if(pagamento == '1') {
	 total = total - (total * 0.2);
			 
	 }else if (pagamento == '2') {
		 total = total - (total * 0.15);
	 }else if (pagamento == '3') {
		 total = total
	 }else if (pagamento == '4') {
		 total = total + (total * 0.1);
	 }else {
		 System.out.print("\nEscolha uma forma de pagamento válida\n" );
	 }
 } while (pagamento != '1' e pagamento != '2' e pagamento != '3' e pagamento != '4');
 
 /*/*
			NOME DA LOJA - CNPJ
			NOME DO COMPRADOR - CPF	
			Loop (valor de cada produto):
				quantidae - produto - valor do produto
			valor do imposto
			forma de pagamento
			valor total da nota
 
 }
 

}
