package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		DecimalFormat numFormatado = new DecimalFormat("R$ #,##0.00");
		
		double novoSalario=0;
		
		String[] arrayNomeFunc = new String[5];
		double[] arraySalario = new double[5];
		int[] arrayTempo = new int[5];
		
		//Entrada de Dados
		for(int i=0; i<5; i++){
			
			System.out.println("----------" + (i+1) + "o. FUNCIONÁRIO -----------------");
			
			System.out.print("Informe  o nome do funcionário: ");
			arrayNomeFunc[i] = in.next();
			
			System.out.print("Informe  o salário do funcionário: ");
			arraySalario[i] = in.nextDouble();
			
			System.out.print("Informe  o tempo de serviço do funcionário: ");
			arrayTempo[i] = in.nextInt();
			
		}

		
		// Relatório com os nomes dos funcionários que  não terão aumento
		System.out.println("-------------FUNCIONÁRIOS QUE NÃO TERÃO AUMENTO-------------------------");
		
		for(int i=0; i<5; i++){
			
			if (arrayTempo[i] <= 5 && arraySalario[i] >= 780) {
				System.out.println(arrayNomeFunc[i]);
			}
			
		}		
		
		// Relatório apenas com os nomes e os novos salários dos funcionários que terão aumento
		System.out.println("------------FUNCIONÁRIOS QUE TERÃO AUMENTO------------------------");
		
		for(int i=0; i<5; i++){
			 
			if (arrayTempo[i] > 5 || arraySalario[i] < 780) {
				
				if(arrayTempo[i] > 5 & arraySalario[i] < 780) {
				novoSalario = arraySalario[i]*1.35;
				}
				else if(arrayTempo[i] > 5){
					novoSalario = arraySalario[i]*1.25 ;
				}else {
					novoSalario = arraySalario[i]*1.15;
					}
				System.out.println("Nome: "+ arrayNomeFunc[i] + "			- novo salário - "+ numFormatado.format(novoSalario));
				}//if
			
		in.close();
	}//for
}
}