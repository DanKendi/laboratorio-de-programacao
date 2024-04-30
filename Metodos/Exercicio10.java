package fiap;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio10 {
	
	static DecimalFormat decF = new DecimalFormat("#%");

	static Scanner entrada = new Scanner(System.in);
	// Vetor P�blico
	static String[] pilotos = new String[] { "Daniel", "Kimi", "Lewis", "Nico", "Sebastian" };

	public static void main(String[] args) {

		// Vetores Main
		String[] gps = new String[] { "Bélgica", "Itália", "Cingapura", "Malásia", "Japão" };
		int[] meta = new int[] { 70, 75, 100, 85, 87 };

		// chamada A)
		relatotioGerencial(gps, meta);
	}

	// M�TODOS
	// A)
	public static void relatotioGerencial(String[] gps, int[] meta) {

		// chamada B)
		int[][] pontuacao = carregaPontuacao(gps);

		// chamada C)
		int[] pontosPiloto = pontuacaoPiloto(pontuacao);
		System.out.println("");
		System.out.println("Pontuação Pilotos");
		for (int i = 0; i < 5; i++) {
			System.out.println("Piloto " + pilotos[i] + " - " + pontosPiloto[i]);
		}
		// chamada D)
		String analiseMetas[] = verificaMetas(pontosPiloto, meta);
		System.out.println("");
		System.out.println("Metas");
		for (int i = 0; i < 5; i++) {
			System.out.println(pilotos[i] + " - " + analiseMetas[i]);
		}
		
		exibeMaiorPontuacao(pontuacao, gps);
		// chamada E)
		ranking(pontosPiloto);
	}

	// B)
	public static int[][] carregaPontuacao(String[] gps) {

		int[][] pontuacao = new int[5][5];
		for (int pi = 0; pi < 5; pi++) {
			System.out.println("Piloto " + pilotos[pi]);
			for (int gp = 0; gp < 5; gp++) {
				System.out.print("Pontuação GP " + gps[gp] + ":");
				pontuacao[gp][pi] = entrada.nextInt();
			}
		}

		return pontuacao;

	}

	// C)
	public static int[] pontuacaoPiloto(int[][] pontuacao) {
		int totalPontos=0;
		int[] pontosPiloto = new int[5];
		double[] porcPiloto = new double[5];

		for (int pi = 0; pi < 5; pi++) {
			for (int gp = 0; gp < 5; gp++) {
				pontosPiloto[pi] += pontuacao[gp][pi];
				totalPontos += pontuacao[gp][pi];
			}
		}
		System.out.println("Porcentagem pilotos");
		for (int i = 0; i < 5; i++) {
			System.out.println("Piloto - "+pilotos[i]+" Porcentagem de desempenho - "+decF.format((double)pontosPiloto[i]/totalPontos));
		}
		

		return pontosPiloto;
	}

	// D)
	public static String[] verificaMetas(int[] pontosPiloto, int[] metas) {

		String analiseMetas[] = new String[5];

		for (int i = 0; i < 5; i++) {
			if (pontosPiloto[i] >= metas[i]) {
				analiseMetas[i] = "Atingiu pontuação";
			} else {
				analiseMetas[i] = "N�o Atingiu pontua��o";
			}
		}
		return analiseMetas;
	}

	// E)
	public static void ranking(int[] pontosPiloto) {

		int auxPontos = 0;
		String auxPiloto;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {

				if (pontosPiloto[j] < pontosPiloto[j + 1]) {
					//pontua��o
					auxPontos = pontosPiloto[j];
					pontosPiloto[j] = pontosPiloto[j + 1];
					pontosPiloto[j + 1] = auxPontos;
					
					auxPiloto = pilotos[j];
					pilotos[j] = pilotos[j + 1];
					pilotos[j + 1] = auxPiloto;

				}
			}
		}
		System.out.println("");
		System.out.println("Ranking dos Pilotos"); 
		for (int i = 0; i < 5; i++) {
		System.out.println((i+1)+"º "+pilotos[i]);	
		}

	}
	
	public static void exibeMaiorPontuacao(int[][] pontuacao, String[] gps) {
		int maiorPontuacao =0, auxPiloto=0, auxGP=0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(pontuacao[j][i] > maiorPontuacao) {
					maiorPontuacao = pontuacao[j][i];
					auxPiloto = i;
					auxGP = j;
				}
			}
		}
		System.out.println("---- GRAND PRIX COM MELHOR PONTUAÇÃO\n");
		System.out.println("Pontuação - "+maiorPontuacao);
		System.out.println("Grand Prix - "+gps[auxGP]);
		System.out.println("Piloto - "+pilotos[auxPiloto]);
	}

}

