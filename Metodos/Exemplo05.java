package fiap;

import java.util.Scanner;

public class Exemplo05 {

	static Scanner in = new Scanner(System.in);
	static int somaIdade = 0;

	public static void main(String[] args) {
		// Vetores locais
		String[] nomesAtletas = new String[4];
		int[] idadesAtletas = new int[4];

		// Carregar vetores
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite o nome do Atleta: ");
			nomesAtletas[i] = in.next();
			System.out.print("Digite a idade do Atleta: ");
			idadesAtletas[i] = in.nextInt();
		}
		// Chamada da função
		String[] competir = verifica(idadesAtletas);

		// Chamada procedimento
		relatorio(nomesAtletas, idadesAtletas, competir);
	}

//Função
	public static String[] verifica(int[] idadesAtletas) {
		String[] competir = new String[4];

		for (int i = 0; i < 4; i++) {
			if (idadesAtletas[i] >= 18) {
				competir[i] = "Irá competir";
			} else {
				competir[i] = "Não irá competir";
			}
			somaIdade += idadesAtletas[i];
		}

		return competir;
	}

	public static void relatorio(String[] nomesAtletas, int[] idadesAtletas, String[] competir) {
		System.out.println("Relatório Atletas");
		for (int i = 0; i < 4; i++) {
			System.out.println(nomesAtletas[i] + " - " + idadesAtletas[i] + " - " + competir[i]);
		}
		System.out.println("\nMédia Idades");
		System.out.println("Média idades: " + somaIdade / 4 + " anos.");
	}

}