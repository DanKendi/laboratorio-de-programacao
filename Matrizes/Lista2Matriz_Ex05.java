package fiap;

import java.text.DecimalFormat;

public class Lista2Matriz_Ex05 {

	public static void main(String[] args) {
		DecimalFormat decF = new DecimalFormat("0.00");
		double[][] precos = new double[12][5];
		String[] lojas = new String[] { "LojaA", "LojaB", "LojaC", "LojaD", "LojaE" };
		String[] produtos = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" };
		int idcMaisPrd = 0, idcMenorPrd = 0, idcMaisLj = 0, idcMenorLj = 0;
		double maiorPrc = 0, menorPrc = 0;

		for (int l = 0; l < 12; l++) {
			System.out.println("Produto " + produtos[l]);
			for (int c = 0; c < 5; c++) {
				precos[l][c] = (double) (Math.random() * 100);
				System.out.println("Preço: " + decF.format(precos[l][c]) + " " + lojas[c]);
				if (precos[l][c] > maiorPrc) {
					maiorPrc = precos[l][c];
					idcMaisPrd = l;
					idcMaisLj = c;
				}
				if (l == 0 && c == 0) {
					menorPrc = precos[l][c];
				}
				if (precos[l][c] < menorPrc) {
					menorPrc = precos[l][c];
					idcMenorPrd = l;
					idcMenorLj = c;
				}
			} // for c
			System.out.println("");
		} // for l

		System.out.println("Produto mais barato: " + produtos[idcMenorPrd]);
		System.out.println(lojas[idcMenorLj]);
		System.out.println("Preço: " + decF.format(precos[idcMenorPrd][idcMenorLj]));
		System.out.println("");
		System.out.println("Produto mais caro: " + produtos[idcMaisPrd]);
		System.out.println("Loja: " + lojas[idcMaisLj]);
		System.out.println("Preço: " + decF.format(precos[idcMaisPrd][idcMaisLj]));
	}

}
