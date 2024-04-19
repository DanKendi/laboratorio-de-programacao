package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista1Matriz_Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DecimalFormat decF = new DecimalFormat("0.00");

		int[][] semestre1 = new int[5][3];
		int[][] semestre2 = new int[5][3];
		int[][] anual = new int[5][3];
		int matriculaUnidadeAnual = 0, maiorMatricula = 0, indiceMaior = 0;
		double porcentagem = 0, totalMatriculas = 0;
		int[] somaMatriCursos = new int[5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				semestre1[i][j] = (int) (Math.random() * 150);
				semestre2[i][j] = (int) (Math.random() * 100);
				anual[i][j] = semestre1[i][j] + semestre2[i][j];
				totalMatriculas += anual[i][j];
				somaMatriCursos[i] += anual[i][j];
			}
		}
		for (int l = 0; l < 5; l++) {
			System.out.println("Curso " + (1 + l));
			for (int c = 0; c < 3; c++) {
				System.out.println("Quantidade de pessoas matriculadas na Unidade " + (1 + c) + ":" + anual[l][c]);
			}
			System.out.println("");
		}

		for (int c = 0; c < 3; c++) {
			if (c > 0) {
				System.out.println("");
			}
			for (int l = 0; l < 5; l++) {
				matriculaUnidadeAnual += anual[l][c];
			}
			System.out.println("Quantidade de matrículas anuais na unidade " + (c + 1) + ": " + matriculaUnidadeAnual);
			matriculaUnidadeAnual = 0;
		}
		for (int l = 0; l < 5; l++) {
			if (l == 0) {
				System.out.println("");
			}
			porcentagem = (double) ((somaMatriCursos[l] / totalMatriculas) * 100);
			System.out.println("Porcentagem de matrículas de cada curso por ano: " + decF.format(porcentagem));
		}

		for (int i = 0; i < 5; i++) {
			if (somaMatriCursos[i] > maiorMatricula) {
				maiorMatricula = somaMatriCursos[i];
				indiceMaior = i;
			}
		}
		System.out.println("");
		System.out.println("O curso com o maior número de matriculas é o curso " + (indiceMaior + 1) + " com "
				+ maiorMatricula + " alunos.");

	}

}
