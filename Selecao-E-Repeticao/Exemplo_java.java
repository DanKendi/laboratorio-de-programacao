package fiap;

import java.util.Scanner;

public class Exemplo_java {

	
	//Estrutura Principal
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Entrada de dados
		//ctrl + shift + o
		Scanner entrada = new Scanner (System.in);
		
		//var
		int idade=0,cont50=0,contAlt=0,corPreto=0,contA=0;
		double peso=0, altura=0,somaAlt=0,mediaAlt=0;
		String corCabelo="";
		char corOlho=0;
		
		//repetição
		
		for (int i=0;i<3;i++) {
			
			System.out.println((i+1)+"º Pessoa");
			
			System.out.println("Digite a idade:");
			idade = entrada.nextInt();
					
			System.out.println("Digite o peso:");
			peso = entrada.nextDouble();
					
			System.out.println("Digite a altura:");
			altura = entrada.nextDouble();
			
			System.out.println("Cor do cabelo Preto/Castanho:");//String
			corCabelo = entrada.next();
			
			System.out.println("Cor dos olhos A/P/C");//Char
			corOlho = Character.toUpperCase(entrada.next().charAt(0));
			while (corOlho != 'A' && corOlho != 'P' && corOlho != 'C') {
				System.out.println("Digite uma opção valida! A - Azul/P - Preto/C - Castanho");
				corOlho = Character.toUpperCase(entrada.next().charAt(0));
			}
			
		}
		

		
		if(idade>50) {
			cont50++;
		}
		
		if(idade>10 && idade<35) {
			somaAlt+=altura;
			contAlt++;
		}
		
		mediaAlt=(double)somaAlt/contAlt;
		
		//String tem que colocar .equalsIgnoreCase()
		if(corCabelo.equalsIgnoreCase("Preto")) {
			corPreto++;
		}
		
		if(corOlho=='A') {
			contA++;
		}
		
		System.out.println("");
		System.out.println("Qtd pessoas com idade superior a 50 anos:" +cont50);
		System.out.println("Média das alturas:"+mediaAlt);
		System.out.println("Qtd pessoas com cabelo preto:"+corPreto);
		System.out.println("Qtd pessoas com olhos azuis:"+contA);
		
	}//main

}
