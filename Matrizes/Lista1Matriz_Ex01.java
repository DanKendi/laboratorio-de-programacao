package fiap;

import java.util.Scanner;

public class Lista1Matriz_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[][] lista = new int[4][5];

		for (int i = 0; i < 4; i++) {
			System.out.print("Digite o código do " + (i + 1) + " º cliente: ");
			lista[i][0] = in.nextInt();
			System.out.print("Digite a quantidade de milhagem: ");
			lista[i][1] = in.nextInt();
			System.out.print("Digite a categoria (1-Diamante, 2-Ouro e 3-Prata): ");
			lista[i][2] = in.nextInt();
			while (lista[i][2] < 1 || lista[i][2] > 3) {
				System.out.println("Categoria Inválida! ");
				System.out.print("Digite a categoria corretamente (1-Diamante, 2-Ouro e 3-Prata): ");
				lista[i][2] = in.nextInt();
			}
			if (lista[i][2] == 1) {
				lista[i][3] = 10000;
			} else if (lista[i][2] == 2) {
				lista[i][3] = 5000;
			} else {
				lista[i][3] = 0;
			}
			lista[i][4] = lista[i][3] + lista[i][1];
		}
		System.out.println("---------------------------------------------");
		for (int i = 0; i < 4; i++) {
			System.out.println("Código do Cliente: " + (i + 1) + "\t Quant. Milhagem: " + lista[i][1] + "\t Categoria: "
					+ lista[i][2] + "\t Bônus: " + lista[i][3] + "\t Milhagem Atual: " + lista[i][4]);
		}
		System.out.println("---------------------------------------------");
	}

}
