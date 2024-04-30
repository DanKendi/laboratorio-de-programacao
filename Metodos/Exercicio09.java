package fiap;

import java.util.Scanner;

public class Exercicio09 {

	static Scanner in = new Scanner(System.in);

	static String[][] arrayHDados = new String[5][2];
	static int[][] arrayHNumero = new int[5][2];

	public static void main(String[] args) {
		String[] produtos = new String[] { "Refrigerante Lata", "Água sem Gás", "Água com Gás", "Suco de Laranja",
				"Barra de Chocolate" };

		double[] precoProdutos = new double[] { 2.80, 1.9, 2.1, 2.3, 4.9 };

		String[] servicos = new String[] { "Lavaderia", "Sauna", "Almoço", "Café da Manhã", "Jantar" };

		double[] precoServicos = new double[] { 10.5, 6.8, 42.9, 35.6, 60.4 };

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Informe do nome do cliente: ");
				arrayHDados[i][0] = in.next();
				System.out.println(
						"Informe o tipo de acomodação [S - Single | D - Double | SL - Suite Luxo | SR - Suite Presidencial]: ");
				arrayHDados[i][1] = in.next();
				while (!arrayHDados[i][1].equalsIgnoreCase("S") && !arrayHDados[i][1].equalsIgnoreCase("D")
						&& !arrayHDados[i][1].equalsIgnoreCase("SL") && !arrayHDados[i][1].equalsIgnoreCase("SR")) {
					System.out.println("Tipo de acomodação inválida!");
					System.out.println(
							"Informe o tipo de acomodação [S - Single | D - Double | SL - Suite Luxo | SR - Suite Presidencial]: ");
					arrayHDados[i][1] = in.next();
				}

				arrayHNumero[i][0] = i + 1;
				System.out.println("Número do Quarto: " + arrayHNumero[i][0]);
				System.out.println("Informe a Quantidade de Diárias: ");
				arrayHNumero[i][1] = in.nextInt();
			}
		} // for i

		int[][] qtdProdConsumido = qtdProdConsumido(produtos);
		int[][] qtdServConsumido = qtdServConsumido(servicos);

	}

	public static int[][] qtdProdConsumido(String[] produtos) {
		int[][] qtdProdConsumido = new int[5][5];
		System.out.println("------ CONSUMO PRODUTOS HOSPEDAGEM ------");
		for (int i = 0; i < 5; i++) {
			System.out.println("--- HOSPEDAGEM " + (i + 1) + " ---");
			for (int j = 0; j < 5; j++) {
				System.out.print("Informe da quantidade consumida do Produto (" + produtos[j] + "): ");
				qtdProdConsumido[i][j] = in.nextInt();
			}
		}
		return qtdProdConsumido;
	}

	public static int[][] qtdServConsumido(String[] servicos) {
		int[][] qtdServConsumido = new int[5][5];

		System.out.println("------ CONSUMO SERVIÇOS HOSPEDAGEM ------");
		for (int i = 0; i < 5; i++) {
			System.out.println("--- HOSPEDAGEM " + (i + 1) + " ---");
			for (int j = 0; j < 5; j++) {
				System.out.print("Informe da quantidade consumida do Serviço (" + servicos[j] + "): ");
				qtdServConsumido[i][j] = in.nextInt();
			}
		}
		return qtdServConsumido;
	}

	public static double calculoVlrHospedagem(String tipoHospedagem, int qtdDiarias) {
		switch (tipoHospedagem) {
		case "S":
			return 240 * qtdDiarias;
		case "D":
			return 280 * qtdDiarias;
		case "SL":
			return 310 * qtdDiarias;
		default:
			return 400 * qtdDiarias;
		}
	}

	public static void relatorioGerencial(int[][] qtdProdConsumido, int[][] qtdServConsumido, double[] precoServicos,
			double[] precoProdutos) {
		double[] totalGeral = new double[5];
		double[] totProdutos = new double[5];
		double[] totServicos = new double[5];

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				totProdutos[j] = qtdProdConsumido[i][j] * precoProdutos[i];
				totServicos[j] = qtdServConsumido[i][j] * precoServicos[i];
			}
			totalGeral[j] = calculoVlrHospedagem(arrayHDados[j][1], arrayHNumero[j][1]) + totProdutos[j]
					+ totServicos[j];
		}

		System.out.println("-----------------------------------------");
		System.out.println("------ RELATÓRIO GERENCIAL DIÁRIAS ------");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < 5; i++) {
				System.out.println("Número do Quarto: " + arrayHNumero[i][0]);
				System.out.println("Nome do Cliente: " + arrayHDados[i][0]);
				System.out.println("Tipo de acomodação: " + arrayHDados[i][1]);
				System.out.println("Quantidade de Diárias: " + arrayHNumero[i][1]);
				System.out.println(
						"Valor total das diárias: " + calculoVlrHospedagem(arrayHDados[i][1], arrayHNumero[i][1]));
				System.out.println("Total Serviço: "+totServicos[i]);
				System.out.println("Total Produto: "+totProdutos[i]);
				System.out.println("Total Geral: "+totalGeral[i]);
		}

	}
}
