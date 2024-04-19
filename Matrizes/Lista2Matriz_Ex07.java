package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista2Matriz_Ex07 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		DecimalFormat decF = new DecimalFormat("0.00");

		String[] cidades = new String[] { "CAMPINAS", "BAURU", "SOROCABA", "ATIBAIA", "SANTOS" };
		double[][] distancia = new double[5][5];
		double kmLitro = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					distancia[i][j] = 0;
				} else {
					System.out.print("Informe a distância entre a cidade ( " + cidades[i] + " ) e a cidade ( "
							+ cidades[j] + " ): ");
					distancia[i][j] = in.nextDouble();
				}
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.print("Informe o consumo do veículo: ");
		kmLitro = in.nextDouble();
		System.out.println("----------------------------------------------------");

		System.out.println("---------- PERCURSOS INFERIORES A 250 KM ----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (distancia[i][j] <= 250 && distancia[i][j] != 0) {
						System.out.println("-- Distância: " + distancia[i][j] + "\t km - entre a cidade ( " + cidades[i]
								+ " ) e ( " + cidades[j] + " )");
				}
			}
		}

		System.out.println("---------- CONSUMOS POR PERCURSO ----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (distancia[i][j] != 0) {
					System.out.println("Consumo entre a cidade ( " + cidades[i] + " ) e ( " + cidades[j] + " ) é: "
							+ (distancia[i][j] / kmLitro) + " L.");
				}
			}
		}

	}

}
