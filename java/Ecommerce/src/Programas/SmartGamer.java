package Programas;
	
	package Programas;
	import Classes.Celulares;
	import Classes.Produto;
	import Classes.Jogos;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;


	public class SmartGamer {
	    public static void main(String[] args) {
	        String auxProd;
	       int x = 0;
	       int pos = -1;


	        Scanner leia = new Scanner(System.in);
	        List<Produto> lista = new ArrayList<>();
	        //LISTAS A SEREM PREENCHIDAS

	        lista.add(new Celulares("RogPhone 3\t", 10, "G4-2", 0000.0, "Asus\t", "Galaxy 1.5\t"));
	        lista.add(new Celulares("LG K20\t    ", 10, "G4-3", 0000.0, "Lg", "Galaxy 1.5"));
	        lista.add(new Celulares("Galaxy S10\t", 10, "G4-4", 0000.0, "Samsung", "Galaxy 1.5"));
	        lista.add(new Celulares("Iphone X\t  ", 10, "G4-5", 0000.0, "Apple", "Galaxy 1.5"));
	        lista.add(new Jogos("TheWitcher\t", 10, "G4-6", 0000.0, "Galaxy 1.5"));
	        lista.add(new Jogos("RDR2\t      ", 10, "G4-7", 0000.0, "Galaxy 1.5"));
	        lista.add(new Jogos("Gta5\t      ", 10, "G4-8", 0000.0, "Galaxy 1.5"));
	        lista.add(new Jogos("Undertale\t ", 10, "G4-9", 0000.0, "Galaxy 1.5"));
	        lista.add(new Jogos("inFamous\t  ", 10, "G4-10", 0000.0, "Galaxy 1.5"));


	        //MOSTRAR NA TELA O CLIENTE QUER
	        System.out.println("COD\t\tPRODUTO\t\t\tVALOR\t\tESTOQUE");

	        for (Produto item : lista) {
	            System.out.println(item.getCodigo()+"\t"+item.getValor()+"\t"+item.getEstoque()+"\t"+item.getProduto()+((item.getEstoque()>0)?" ":"\tPRODUTO INDISPONIVEL"));
	        }
	        System.out.println("Digite o c�digo do produto: ");
	        auxProd = leia.next().toUpperCase();


	        for (x = 0; x < lista.size(); x++) {
	            if (lista.get(x).getCodigo().equals(auxProd)) {
	                pos = x;
	                break;
	            }
	        }
	        System.out.printf("%s\t%.2f\t%d\t%s\n",lista.get(pos).getCodigo(),lista.get(pos).getValor(),lista.get(pos).getEstoque(),lista.get(pos).getProduto());
	    }
	}


