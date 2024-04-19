package fiap;

import java.util.Scanner;

public class MatrizExemplo01 {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numeros = new int[3][3];

		// Carregar Matriz
		// Linhas
		for (int linha = 0; linha < 3; linha++) {// congela
			for (int coluna = 0; coluna < 3; coluna++) {// coração
				System.out.print("Digite o elemento [ " + linha + " , " + coluna + " ]: ");
				numeros[linha][coluna] = in.nextInt();

			} // coluna
		} // linha

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print(numeros[x][y] + "\t");
			}
			System.out.println("\n");
		}
	}

}
