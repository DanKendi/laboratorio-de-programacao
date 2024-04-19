package fiap;

import java.util.Scanner;

public class Exemplo02Matriz {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numeros = new int[4][4];
		int somaLinha = 0, somaTotal = 0, somaColuna=0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Digite o valor da [Linha " + i + " Coluna " + j + "]: ");
				numeros[i][j] = in.nextInt();

			} // forJ
		} // forI
		for (int i = 0; i < 4; i++) {
			somaLinha = 0;
			somaColuna =0;
			for (int j = 0; j < 4; j++) {
				somaLinha += numeros[i][j];
				somaTotal += numeros[i][j];
				somaColuna += numeros[j][i];
			} // forJ
			System.out.print("Soma linha " + i + ": " + somaLinha);
			System.out.println(" Soma coluna " + i + ": " + somaColuna);
		} // forI
		System.out.println("Total geral da Matriz: " + somaTotal);
	}

}
