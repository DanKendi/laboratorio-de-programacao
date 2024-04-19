package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo03Matriz {

	public static Scanner in = new Scanner(System.in);
	public static DecimalFormat decF = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nomes = new String[] { "Ana", "João", "Luis" };
		double[][] notas = new double[3][4];
		double somaNotas = 0;

		for (int a = 0; a < 3; a++) {
			somaNotas = 0;
			for (int n = 0; n < 3; n++) {
				System.out.print("Digite a nota " + (n + 1) + "º do(a) aluno(a) " + nomes[a] + ":");
				notas[a][n] = in.nextDouble();
				somaNotas += notas[a][n];
			}// for N
			notas[a][3] = somaNotas / 3;
		}// for A
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno(a) " + nomes[i] + " - Média: " + decF.format(notas[i][3]));
		}// for I

	}

}
