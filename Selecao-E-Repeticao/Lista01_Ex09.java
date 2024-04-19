package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista01_Ex09 {

	static Scanner e = new Scanner(System.in);
	static DecimalFormat decF = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, qtd = 0, opA = 0, opB = 0, opC = 0, opD = 0, opE = 0;
		char op = 0;
		float mediaIdd = 0, percA = 0, percB = 0, percC = 0, percD = 0, percE = 0;

		System.out.print("Informe sua idade: ");
		idade = e.nextInt();

		while (idade != 0) {

			System.out.println("");
			System.out.print("Informe sua opnião sobre o filme: (A-Ótimo B-Bom C-Regular D-Ruim E-Péssimo)");
			op = Character.toUpperCase(e.next().charAt(0));

			while (op != 'A' && op != 'B' && op != 'C' && op != 'D' && op != 'E') {
				System.out
						.print("Informe uma opnião CORRETA sobre o filme: (A-Ótimo B-Bom C-Regular D-Ruim E-Péssimo)");
				op = Character.toUpperCase(e.next().charAt(0));
			}

			if (op == 'A') {
				opA++;
			} else if (op == 'B') {
				opB++;
			} else if (op == 'C') {
				opC++;
			} else if (op == 'D') {
				opD++;
			} else {
				opE++;
			}

			mediaIdd += idade;

			qtd++;
			System.out.print("Informe sua idade: ");
			idade = e.nextInt();
		}

		mediaIdd = (float) mediaIdd / qtd;
		percA = (float) opA / qtd * 100;
		percB = (float) opB / qtd * 100;
		percC = (float) opC / qtd * 100;
		percD = (float) opD / qtd * 100;
		percE = (float) opE / qtd * 100;

		System.out.println("A quantidade de pessoas que respodeu à pesquisa é:" + qtd);
		System.out.println("A média de idade das pessoas que responderam à pesquisa é:" + decF.format(mediaIdd));
		System.out.println("A porcentagem de pessoas que acharam o filme Ótimo (A) é:" + decF.format(percA));
		System.out.println("A porcentagem de pessoas que acharam o filme Bom (B) é:" + decF.format(percB));
		System.out.println("A porcentagem de pessoas que acharam o filme Regular (C) é:" + decF.format(percC));
		System.out.println("A porcentagem de pessoas que acharam o filme Ruim (D) é:" + decF.format(percD));
		System.out.println("A porcentagem de pessoas que acharam o filme Péssimo (E) é:" + decF.format(percE));

	}

}
