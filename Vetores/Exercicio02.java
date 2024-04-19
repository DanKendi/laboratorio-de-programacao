package A0502;

import java.util.Scanner;

public class Exercicio02 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nomes = new String[10];
		
		String procura="";
		
		for (int i=0;i<nomes.length;i++) {
			System.out.print("Digite o "+(i+1)+" nome: ");
			nomes[i]=in.next();
		}
		System.out.print("Digite o nome para procurar no vetor: ");
		procura=in.next();
		
		for (int i=0;i<nomes.length;i++) {
			if (procura.equalsIgnoreCase(nomes[i])) {
				System.out.println("Achei - posição: "+(i+1));
			}else {
				System.out.println("Não Achei");
			}
		}
	}

}
