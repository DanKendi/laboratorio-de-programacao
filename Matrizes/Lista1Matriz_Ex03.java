package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista1Matriz_Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DecimalFormat decF = new DecimalFormat("0.00");

		String[] lojas = new String[8];
		String[] prod = new String[4];
		double[][] precos = new double[4][8];
		String[][] prod120 = new String[5][8];

		for (int i = 0; i < 8; i++) {
			System.out.print("Informe o nome da loja " + (i + 1) + ": ");
			lojas[i] = in.next();
		}
		for (int i = 0; i < 4; i++) {
			System.out.print("Informe o nome do produto " + (i + 1) + ": ");
			prod[i] = in.next();
		}
		System.out.println("");
		System.out.println("---------------------------- Preços por produtos por loja ---------------------------- ");
		for (int i = 0; i < 4; i++) {
			System.out.println("Produto: " + prod[i]);
			for (int j = 0; j < 8; j++) {
				precos[i][j] = (double) (Math.random() * 190);
				System.out.println("Informe o preço do produto " + prod[i] + " na loja " + lojas[j] + ": "
						+ decF.format(precos[i][j]));
			}
		}
		System.out.println("");
		System.out.println(
				"---------------------------- Produtos que custam meNos de R$ 120.00 ---------------------------- ");
		for (int i = 0; i < 4; i++) {
			System.out.println("Produto: " + prod[i]);
			for (int j = 0; j < 8; j++) {
				if (precos[i][j] < 120) {
					System.out.println("Loja: " + lojas[j] + " Preço: " + decF.format(precos[i][j]));
				}

			}
		}

	}

}
