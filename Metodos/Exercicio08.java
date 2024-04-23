package fiap;

import java.util.Scanner;

public class Exercicio08 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String[] produtos = new String[] { "Notebooks", "Computadores", "Tablets", "Servidores" };
		int[][] qtdVendas = new int[4][4];
		int[] ttlVendas = new int[4];
		int[] vendasTri = new int[4];
		int[] metaVendas = new int[] { 30, 20, 15, 10 };
		String[] metas = new String[4];

		qtdVendas = entraQtdVendida(produtos);
		ttlVendas = calcTtlVendas(qtdVendas);
		vendasTri = calcVendasTri(qtdVendas);
		metas = verifMetas(ttlVendas, metaVendas);

		System.out.println("------ RELATÓRIO DE VENDAS ------\n");
		System.out.println("------ Total de vendas por produto: ");
		for (int i = 0; i < 4; i++) {
			System.out.println(produtos[i] + ": " + ttlVendas[i] + " - Meta: " + metas[i]);
		}

		System.out.println("\n------ Total de vendas por trimestre: ");
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + "º TRIMESTRE - " + vendasTri[i] + " produtos.");
		}

		System.out.println("");
		rankingVendas(ttlVendas, produtos);
	}

	public static int[][] entraQtdVendida(String[] produtos) {
		int[][] qtdVendida = new int[4][4];

		for (int i = 0; i < 4; i++) {
			System.out.println("------ " + (1 + i) + "º TRIMESTRE ------");
			for (int j = 0; j < 4; j++) {
				System.out.print("Informe a quantidade de " + produtos[j] + " vendida: ");
				qtdVendida[i][j] = in.nextInt();
			}
		}
		return qtdVendida;
	}

	public static int[] calcTtlVendas(int[][] qtdVendas) {
		int[] ttlVendas = new int[4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				ttlVendas[j] += qtdVendas[i][j];
			}
		}
		return ttlVendas;
	}

	public static int[] calcVendasTri(int[][] qtdVendas) {
		int[] vendasTri = new int[4];

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				vendasTri[i] += qtdVendas[i][j];
			}
		}
		return vendasTri;
	}

	public static String[] verifMetas(int[] ttlVendas, int[] metaVendas) {
		String[] verifMetas = new String[4];

		for (int i = 0; i < 4; i++) {
			if (ttlVendas[i] >= metaVendas[i]) {
				verifMetas[i] = "Atingiu Meta";
			} else {
				verifMetas[i] = "Não Atingiu";
			}
		}
		return verifMetas;
	}

	public static void rankingVendas(int[] ttlVendas, String[] produtos) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (ttlVendas[j] < ttlVendas[j + 1]) {
					int aux = ttlVendas[j];
					ttlVendas[j] = ttlVendas[j + 1];
					ttlVendas[j + 1] = aux;

					String aux2 = produtos[j];
					produtos[j] = produtos[j + 1];
					produtos[j + 1] = aux2;
				}
			}
		}
		System.out.println("\n------ RANIKNG DE VENDAS ------");
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + "º - " + produtos[i] + " - " + ttlVendas[i] + " produtos vendidos.");
		}
	}
}
