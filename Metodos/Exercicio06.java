package fiap;

import java.util.Scanner;

public class Exercicio06 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] chamados = VerificaChamados();

		NumerosErros(chamados);

		int[] numCriterios = NumerosCriterios(chamados);

		System.out.println("----- RELATÓRIO DE CHAMADOS POR CRITÉRIO ------");
		System.out.println("Número de chamdos - Sistema parado: " + numCriterios[0]);
		System.out.println("Número de chamdos - Grave: " + numCriterios[1]);
		System.out.println("Número de chamdos - Não Grave: " + numCriterios[2]);
		System.out.println("Número de chamdos - Dúvida ou questão: " + numCriterios[3]);

	}

	public static int[][] VerificaChamados() {
		int[][] chamados = new int[5][3];

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o ID do funcionário: ");
			chamados[i][0] = in.nextInt();
			System.out.print("Digite o código do erro (1/2/3): ");
			chamados[i][1] = in.nextInt();
			while (chamados[i][1] < 1 || chamados[i][1] > 3) {
				System.out.println("Código inválido!");
				System.out.print("Digite o código do erro (1/2/3): ");
				chamados[i][1] = in.nextInt();
			}
			System.out.print("Digite o critério do erro (1/2/3/4): ");
			chamados[i][2] = in.nextInt();
			while (chamados[i][2] < 0 || chamados[i][2] > 4) {
				System.out.println("Código inválido!");
				System.out.print("Digite o critério do erro (1/2/3/4): ");
				chamados[i][2] = in.nextInt();
			}
		}

		return chamados;
	}

	public static void NumerosErros(int[][] chamados) {
		int codE1 = 0, codE2 = 0, codE3 = 0;

		for (int i = 0; i < 5; i++) {
			if (chamados[i][1] == 1) {
				codE1++;
			} else if (chamados[i][1] == 2) {
				codE2++;
			} else {
				codE3++;
			}
		}
		System.out.println("------ RELATÓRIO DE CHAMADOS POR ERRO ------");
		System.out.println("Números de chamados com o Códig do erro 1: " + codE1);
		System.out.println("Números de chamados com o Códig do erro 2: " + codE2);
		System.out.println("Números de chamados com o Códig do erro 3: " + codE3);
	}

	public static int[] NumerosCriterios(int[][] chamados) {
		int[] numCriterios = new int[4];

		for (int i = 0; i < 5; i++) {
			if (chamados[i][2] == 1) {
				numCriterios[0]++;
			} else if (chamados[i][2] == 2) {
				numCriterios[1]++;
			} else if (chamados[i][2] == 3) {
				numCriterios[2]++;
			} else {
				numCriterios[3]++;
			}
		}
		return numCriterios;
	}

}
