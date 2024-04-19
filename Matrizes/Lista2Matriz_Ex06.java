package fiap;

import java.text.DecimalFormat;

public class Lista2Matriz_Ex06 {

	public static void main(String[] args) {
		DecimalFormat decF = new DecimalFormat("0.00");

		String[] produtos = new String[] { "Camisa", "Blusa", "Calça", "Vestido", "Meia" };
		double[][] precos = new double[5][4];
		int[] lojas = new int[4];
		double[][] impostos = new double[5][4];
		double[] transporte = new double[] { 10, 15, 20, 10, 5 };

		for (int l = 0; l < 5; l++) {
			System.out.println("Nome do produto: " + produtos[l] + " - Custo do transporte: R$ " + decF.format(transporte[l]));
			for (int c = 0; c < 4; c++) {
				precos[l][c] = (double) (Math.random() * 120);
				if (precos[l][c] > 100) {
					impostos[l][c] = precos[l][c] * 0.2;
				} else if (precos[l][c] > 50) {
					impostos[l][c] = precos[l][c] * 0.1;
				} else {
					impostos[l][c] = precos[l][c] * 0.05;
				}
				System.out.println("------- Loja: " + (c + 1));
				System.out.println("------- Impostos:  R$ " + decF.format(impostos[l][c]));
				System.out.println("------- Preço: R$ " + decF.format(precos[l][c]));
				System.out.println(
						"------- Preço final: R$ " + decF.format((impostos[l][c] + precos[l][c] + transporte[l])));
				
			}
			System.out.println("");
		}
	}

}
