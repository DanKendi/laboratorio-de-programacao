package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista01_Ex07 {

	static Scanner e = new Scanner(System.in);
	static DecimalFormat decF = new DecimalFormat("0.00");

	public static void main(String[] args) {

		int numNasc = 0, mascF = 0, femF = 0, tempVida = 0, f24 = 0;
		float percM = 0, percF = 0, perc24 = 0;
		char sexo = 0;

		System.out.println("Digite o número de crianças nascidas:");
		numNasc = e.nextInt();

		for (int i = 0; i < numNasc; i++) {
			System.out.println("Criança "+(i+1));
			System.out.println("Informe o sexo da criança:");
			sexo = Character.toUpperCase(e.next().charAt(0));

			while (sexo != 'M' && sexo != 'F') {
				System.out.println("Informe corretamente o sexo M-masculino F-Feninino");
				sexo = Character.toUpperCase(e.next().charAt(0));
			}
			System.out.println("Informe o tempo de vida em meses:");
			tempVida = e.nextInt();

			if (sexo == 'M') {
				mascF++;
			} else {
				femF++;
			}
			if (tempVida <= 24) {
				f24++;
			}
		}

		percM = (float) mascF / numNasc * 100;
		percF = (float) femF / numNasc * 100;
		perc24 = (float) f24 / numNasc * 100;
		
		System.out.println("");
		System.out.println("A porcentagem de crianças do sexo masculino mortas no período:"+decF.format(percM)+"%");
		System.out.println("A porcentagem de crianças do sexo feminino mortas no período:"+decF.format(percF)+"%");
		System.out.println("A porcentagem de crianças que viveram 24 meses ou menos é:"+decF.format(perc24)+"%");
		
	}

}
