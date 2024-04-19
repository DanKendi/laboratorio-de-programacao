package A0502;

import java.util.Scanner;

public class Exercicio01 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] arrayMonths = new String[] {"Jan", "Fev", "Mar", "Abr", 
				"Mai","Jun","Jul","Ago","Set","Out", "Nov","Dez"};
		double[] arrayTemps = new double[12];
		double maiorTemp=0, menorTemp=0;
		int indiceMaior=0,indiceMenor=0;
		
		
		for (int i=0;i<12;i++) {
			System.out.println("Digite a temperatura do mês de "+arrayMonths[i]+":");
			arrayTemps[i]=in.nextDouble();
		
			if (arrayTemps[i] > maiorTemp) {
				maiorTemp = arrayTemps[i];
				indiceMaior = i;
			}
			if (i==0) {
				menorTemp = arrayTemps[i];
				indiceMenor = i;
			} else {
				if(arrayTemps[i]<menorTemp) {
					menorTemp = arrayTemps[i];
					indiceMenor=i;
				}
			}
		}
		System.out.println("A maior temperatura do ano foi: "+maiorTemp+" ocorrida no mes de"+arrayTemps[indiceMaior]);
		System.out.println("A menor temperatura do ano foi: "+menorTemp+" ocorrida no mes de"+arrayTemps[indiceMenor]);
	}
}
