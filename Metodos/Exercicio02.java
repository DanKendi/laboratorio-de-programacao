package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

	static Scanner in = new Scanner(System.in);
	static DecimalFormat decF = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Informe o código do caminhão: ");
		int codigoCaminhao = in.nextInt();
		System.out.print("Informe o peso em toneladas da carga: ");
		double pesoCarga = in.nextDouble();

		double precoCarga = calcularPrecoCarga(pesoCarga);

		double valorTotal = calcularImposto(precoCarga);

		System.out.println("\nPreço do fretamento\n");
		System.out.println("Código do caminhão: " + codigoCaminhao);
		System.out.println("Valor da carga: R$" + decF.format(precoCarga) + " - Valor com imposto: R$" + decF.format(valorTotal));

	}

	public static double calcularPrecoCarga(double pesoCarga) {
		System.out.print("Informe o código da carga: ");
		int codigoCarga = in.nextInt();
		while (codigoCarga < 1 || codigoCarga > 30) {
			System.out.println("Código inválido!");
			System.out.print("Informe o código da carga: ");
			codigoCarga = in.nextInt();
		}
		if (codigoCarga >= 21) {
			return (pesoCarga * 1000) * 280;
		} else if (codigoCarga >= 11) {
			return (pesoCarga * 1000) * 200;
		} else {
			return (pesoCarga * 1000) * 120;
		}
	}

	public static double calcularImposto(double precoCarga) {
		System.out.print("Informe o código do Estado (de 1 a 4) : ");
		int codigoEstado = in.nextInt();
		while (codigoEstado < 1 || codigoEstado > 4) {
			System.out.println("Código de estado inválido");
			System.out.print("Informe o código do Estado (de 1 a 4) : ");
			codigoEstado = in.nextInt();
		}
		switch (codigoEstado) {
		case 1:
			return precoCarga * 1.25;
		case 2:
			return precoCarga * 1.2;
		case 3:
			return precoCarga * 1.15;
		default:
			return precoCarga;
		}
	}
}