package fiap;

import java.util.Scanner;

public class Lista2Matriz_Ex09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] qtdProd = new int[7][4];
		String[] produtos = new String[] { "Notebook", "Computadores", "Tablets", "Servidores" };
		int melhorLinha = 0, piorLinha = 0, vlrPiorLinha=0;

		for (int c = 0; c < 4; c++) {
			System.out.println("--- Vendas de " + produtos[c] + " ---");
			for (int l = 0; l < 4; l++) {
				System.out.print("Informe o número de vendas no " + (l + 1) + "º trimestre: ");
				qtdProd[l][c] = in.nextInt();
				qtdProd[5][c] += qtdProd[l][c];
				qtdProd[4][c] += qtdProd[c][l];
				if (qtdProd[5][c] > melhorLinha) {
					melhorLinha = c;
				}
				if (l == 0 && c == 0) {
					vlrPiorLinha = qtdProd[5][c];
					piorLinha = 0;
				}
				if (qtdProd[5][c] < vlrPiorLinha) {
					piorLinha = c;
				}
				System.out.println("");
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.print("Informe a meta para o trimestre " + (i + 1) + ": ");
			qtdProd[6][i] = in.nextInt();
			System.out.println("");
		}
		
		System.out.println("Trimestre que atigiram meta: ");
		for(int i=0;i<4;i++) {
			if (qtdProd[5][i] >= qtdProd[6][i]) {
				System.out.println((i+1)+"º");
			}
		}
		
		System.out.println("");
		System.out.println("Melhor linha: "+produtos[melhorLinha]);
		System.out.println("Pior linha: "+produtos[piorLinha]);

		
	}

}
