package A0502;

import java.util.Scanner;

public class Exemplo02 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nomes = new String[3];
		int[] idades = new int[3];
		
		for (int i=0;i<3;i++) {
			System.out.print("Digite o nome do "+(i+1)+"º atleta:");
			nomes[i]=in.next();
			System.out.print("Digite a idade do "+(i+1)+"º atleta:");
			idades[i]=in.nextInt();
			System.out.println("");
		}
		int i=0;
		while (i<3) {
			System.out.println("Os atletas que em idade superior a 21 anos são:");
			if (idades[i]>21) {
				System.out.println(nomes[i]);
			}
			i++;
		}
	}

}
