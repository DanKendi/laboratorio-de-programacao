package fiap;

import java.util.Scanner;

public class Exercicio05 {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] gabarito = new String[] {"A","A","A","A","A","A","A","A"};
		String[] resposta = new String[8];
		String[] aluno = new String[10];
		int[] nota = new int[10];
		double aprovacao=0;
		
		for (int i=0; i<10; i++) {
			System.out.println("-------------------- Aluno: "+(i+1)+" --------------------");
			System.out.print("Digite o RM do aluno:");
			aluno[i] = in.next();
			
			for (int c=0; c<8; c++) {
				System.out.print("Digite a resposta dada pelo aluno "+ aluno[i] + " à "+(c+1)+" a. questão: ");
				resposta[c] = in.next();
				if(gabarito[c].equalsIgnoreCase(resposta[c])) {
					nota[i]++;
				}
			}
			System.out.println("A nota do aluno "+aluno[i]+" foi "+nota[i]);
			if (nota[i] >= 6) {
				aprovacao = aprovacao+10;
			}//for resp
		}//for main
	
		System.out.println("A aprovação da sala foi de: "+aprovacao+"%");
		
		
		
	}

}
