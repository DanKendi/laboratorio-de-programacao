package fiap;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Aula04_Lista01_Ex04 {
	
	
	public static void main(String[] args){
		
		Scanner e= new Scanner (System.in);
		DecimalFormat numF = new DecimalFormat ("0.00");
		numF.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
		
		int idade=0,req1=0,req3=0,contB=0,req4=0;
		float peso=0,altura=0,prcOAzul=0,mediaIdd=0;
		char olhos,cabelo;
		
		for (int i=1;i<3;i++) {
			System.out.println("Digite a idade: ");
			idade = e.nextInt();
			
			System.out.println("Digite o peso: ");
			peso =e.nextFloat();
			
			System.out.println("Digite a altura em metros: ");
			altura = e.nextFloat();
			
			System.out.println("Digite a cor dos olhos(A-Azul, P-Preto, V-Verde e C-Castanho):");
			olhos = Character.toUpperCase(e.next().charAt(0));
			
			while (olhos != 'A' && olhos != 'P' && olhos != 'V' && olhos != 'C'){
				System.out.println("Digite uma cor válida: A-Azul, P-Preto, V-Verde e C-Castanho");
				olhos = Character.toUpperCase(e.next().charAt(0));
			}
			
			System.out.println("Digite a cor dos cabelos:");
			cabelo = Character.toUpperCase(e.next().charAt(0));
			
			while (cabelo != 'P' && cabelo != 'C' && cabelo != 'L' && cabelo != 'R') {
				System.out.println("Digite uma cor válida: P-Preto, C-Castanho, L-Loiro e R-Ruivo");
				cabelo = Character.toUpperCase(e.next().charAt(0));
			}
			
			if (idade > 50 && peso <60) {
				req1++;
			}
			if (altura < 1.5) {
				contB++;
				mediaIdd = idade+mediaIdd;
			}
			if (olhos == 'A') {
				req3++;
			}
			if (cabelo == 'R' && olhos != 'A') {
				req4++;
			}
		}//for
		
		prcOAzul = (float)req3/3*100;
		mediaIdd  = (float)mediaIdd/contB;
		
		System.out.println("A quantidade de pessoas com idade supeiror a 50 anso e peso inferior a 60 Kgs é:"+req1);
		System.out.println("A média das idades das pessoas com altura inferior a 1,50:"+mediaIdd);
		System.out.println("A porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas:"+numF.format(prcOAzul));
		System.out.println("A quantidade de pessoas ruivas e que não possuem olhos azuis é:"+ req4);
		
		
	}
}
