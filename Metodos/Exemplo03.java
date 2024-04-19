package fiap;

import java.util.Scanner;

public class Exemplo03 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		double num1 = 0, num2 = 0;

		int opcao;

		while (true) {

			System.out.println(
					"Digite a operação desejada (1- Adição / 2 - Subtração / 3 - Multiplicação / 4 - Divisão / 5 - Finalizar): ");
			opcao = in.nextInt();

			if (opcao > 0 && opcao < 5) {
				System.out.print("Digite o primeiro número: ");
				num1 = in.nextDouble();
				System.out.print("Digite o segundo número: ");
				num2 = in.nextDouble();
			}

			switch (opcao) {
			case 1:
				System.out.println("--- Adição ---");
				adicao(num1, num2);
				break;

			case 2:
				System.out.println("--- Subtração ---");
				subtracao(num1, num2);
				break;

			case 3:
				System.out.println("--- Multiplicação ---");
				multiplicacao(num1, num2);
				break;

			case 4:
				System.out.println("--- Divisão ---");
				divisao(num1, num2);
				break;

			case 5:
				System.out.println("Programa Finalizado!");
				System.exit(0);

			default:
				System.out.println("Opção inválida!");
			}

		}

	}

	public static void adicao(double num1, double num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

	public static void subtracao(double num1, double num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}

	public static void multiplicacao(double num1, double num2) {
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
	}

	public static void divisao(double num1, double num2) {
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

	}

}
