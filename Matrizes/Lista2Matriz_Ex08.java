package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista2Matriz_Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DecimalFormat decF = new DecimalFormat("0.00");

		double[][] armazem = new double[5][3];
		int indiceProd2 = 0, indiceMenorEstoq = 0;
		double maiorEstoqProd2 = 0, maiorEstoq = 0, menorEstoq = 0;
		double[] somaArmazem = new double[4];
		double[] somaProd = new double[3];
		double[] custoTotalArm = new double[4];

		for (int l = 0; l < 4; l++) {
			System.out.println("--- Estoque no armazém ( " + (l + 1) + " ) ---");
			for (int c = 0; c < 3; c++) {
				System.out.print("--- Informe a quantidade em estoque do Produto ( " + (c + 1) + " ):");
				armazem[l][c] = in.nextDouble();
				if (c == 1) {
					if (armazem[l][c] > maiorEstoqProd2) {
						maiorEstoqProd2 = armazem[l][c];
						indiceProd2 = l;
					}
				}
				somaArmazem[l] += armazem[l][c];
				if (armazem[l][c] > maiorEstoq) {
					maiorEstoq = armazem[l][c];
				}
				if (c == 0) {
					menorEstoq = armazem[l][c];
				}
				if (armazem[l][c] < menorEstoq) {
					menorEstoq = armazem[l][c];
					indiceMenorEstoq = c;
				}
			}
		}
		System.out.println("");
		System.out.println("------------- CUSTO DE CADA PRODUTO -------------");
		for (int j = 0; j < 3; j++) {
			System.out.print("--- Informe o custo do Produto ( " + (j + 1) + " ):");
			armazem[4][j] = in.nextDouble();

		}

		for (int c = 0; c < 3; c++) {
			for (int l = 0; l < 4; l++) {
				somaProd[c] += armazem[l][c];
			}
		}

		System.out.println("");
		System.out.println("------------- QUANTIDADE DE ITENS EM CADA ARMAZÉM -------------");
		for (int i = 0; i < 4; i++) {
			System.out.println("--- Estoque no armazém (" + (i + 1) + " ): " + somaArmazem[i]);
		}
		System.out.println("");
		System.out.println("------------- ARMAZÉM COM MAIOR ESTOQUE DO PRODUTO 2 -------------");

		System.out.println(
				"--- Armazém ( " + (indiceProd2 + 1) + " ) - Quantidade em estoque: " + armazem[indiceProd2][1]);

		System.out.println("");
		System.out.println("------------- ARMAZÉM COM MENOR ESTOQUE -------------");
		System.out.println("--- Armazém ( " + (indiceMenorEstoq + 1) + " ) - Quantidade em estoque: " + menorEstoq);

		System.out.println("");
		System.out.println("------------- CUSTO TOTAL DE CADA PRODUTO -------------");
		for (int j = 0; j < 3; j++) {
			System.out.println(
					"Custo total do produto ( " + (j + 1) + " ): R$ " + decF.format((somaProd[j] * armazem[4][j])));
		}
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 3; c++) {
				custoTotalArm[l] += armazem[l][c] * armazem[4][c];
			}
		}
		System.out.println("");
		System.out.println("------------- CUSTO TOTAL DE CADA ARMAZÉM -------------");
		for (int i = 0; i < 4; i++) {
			System.out.println("Custo total no armazém ( " + (i + 1) + " ): R$" + decF.format(custoTotalArm[i]));
		}

	}

}
