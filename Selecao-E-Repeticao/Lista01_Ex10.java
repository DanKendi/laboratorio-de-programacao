package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista01_Ex10 {

	static Scanner in = new Scanner(System.in);
	static DecimalFormat decF = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float vDivida = 0, juros = 10;

		System.out.println("Digite o valor inicial da dívida:");
		vDivida = in.nextFloat();

		System.out.println(
				"Total: " + vDivida + "Juros: 0.0 Número de parcelas: 1 Valor da parcela: R$" + decF.format(vDivida));

		for (int i = 3; i < 13; i += 3) {
			System.out.println("Total: " + vDivida * (1 + juros * 0.01) + " Juros: " + juros + " Número de parcelas: "
					+ i + " Valor da parcela: R$" + decF.format(vDivida * (1 + juros * 0.01) / i));
			juros += 5;

		}
	}

}
