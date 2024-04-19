package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
	
	public static Scanner in = new Scanner(System.in);
	public static DecimalFormat numF = new DecimalFormat("#,##0.00");
	
	public static void main(String[] args){
		
		double[] preco = new double[10];
		int[] qtd = new int[10];
		double[] precoTotal = new double[10];
		double comissao=0, totalGeral=0, prcMaiorQtd=0;
		
		for(int i=0;i<10;i++) {
			System.out.println("-------------------- PRODUTO "+(i+1)+" --------------------");
			System.out.print("Informe o preço unitário do produto: ");
			preco[i] = in.nextDouble();
			System.out.print("Informe a quantidade vendida:");
			qtd[i] = in.nextInt();
			precoTotal[i] = preco[i]*qtd[i];
			
			totalGeral = totalGeral + precoTotal[i];
			
			if(i>1) {
				if(qtd[i] > qtd[i-1]) {
					prcMaiorQtd = qtd[i];
				}
			}
		}
		
		System.out.println("-------------------- RELATÓRIO DE VENDAS --------------------");
		for (int i=0; i<10;i++) {
			System.out.println("Qtd: "+ qtd[i]+ "  \tPreço: "+numF.format(preco[i])+"   \tTotal: R$"+numF.format(precoTotal[i]));
		}
		System.out.println("----------------------------------------");
		System.out.println("Total Geral: "+ numF.format(totalGeral));
		System.out.println("-------------------- COMISSÃO --------------------");
		comissao = totalGeral*0.05;
		System.out.println("Comissão: "+ numF.format(comissao));
		
		
	}

}
