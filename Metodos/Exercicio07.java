package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

	static Scanner in = new Scanner(System.in);
	static DecimalFormat decF = new DecimalFormat("###,##0.00");
	static int[] arrayQuant = new int[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrayCarro = new String[] { "Classic", "Cobalt", "Onix", "Prisma", "Cruze" };

		double[] arrayPreco = new double[] { 33600, 44900, 37790, 43150, 55400 };

		int[][] vendas = VendasTri(arrayCarro);

		Relatorio(arrayCarro, arrayPreco, vendas);
	}

	public static int[][] VendasTri(String[] arrayCarro) {
		int[][] vendas = new int[4][5];
		for (int i = 0; i < vendas.length; i++) {
			System.out.println("Vendas " + (i + 1) + "º Trimestre");
			for (int j = 0; j < vendas[0].length; j++) {
				System.out.print("Carro " + arrayCarro[j] + ": ");
				vendas[i][j] = in.nextInt();
			}
		}

		return vendas;
	}

	public static double[] CalcValTotal(int[][] vendas, double[] arrayPreco) {
		double[] vlrTotal = new double[5];
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 4; i++) {
					vlrTotal[j] += arrayPreco[j] * vendas[i][j];
					arrayQuant[j] += vendas[i][j];
			}
		}
		return vlrTotal;
	}

	public static void Relatorio(String[] arrayCarro, double[] arrayPreco, int[][] vendas) {
		double[] vlrTotal = CalcValTotal(vendas, arrayPreco);
		double totalGeral = 0;
		System.out.println("------ RELATÓRIO GERENCIAL VIDORITO ------");
		for (int i = 0; i < 5; i++) {
			System.out.println("Carro: " + arrayCarro[i] + "\t Quantidade Geral: " + arrayQuant[i] + "\t Total: R$ "
					+ decF.format(vlrTotal[i]));
			totalGeral += vlrTotal[i];
		}
		System.out.println("Total Geral de Vendas: \t R$"+ decF.format(totalGeral));
	}
}
