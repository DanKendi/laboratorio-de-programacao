package fiap;

import java.util.Scanner;

public class Exemplo02 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;

		System.out.println(
				"Digite a operação desejada (1- Adição / 2 - Subtração / 3 - Multiplicação / 4 - Divisão / 5 - Finalizar): ");
		opcao = in.nextInt();

		while (true) {

			while (opcao > 5 || opcao < 1) {
				System.out.println("Opção inválida!");
				System.out.println(
						"Digite a operação desejada (1- Adição / 2 - Subtração / 3 - Multiplicação / 4 - Divisão / 5 - Finalizar):");
				opcao = in.nextInt();
			}

			switch (opcao) {
			case 1:
				adicao();
				break;

			case 2:
				subtracao();
				break;

			case 3:
				multiplicacao();
				break;

			case 4:
				divisao();
				break;

			case 5:
				System.out.println("Programa Finalizado!");
				System.exit(0);

			}

			System.out.println("");
			System.out.println(
					"Digite a operação desejada (1- Adição / 2 - Subtração / 3 - Multiplicação / 4 - Divisão / 5 - Finalizar):");
			opcao = in.nextInt();
			System.out.println("");

		}

	}

	public static void adicao() {
		double num1, num2;

		System.out.println("--- Adição ---");
		System.out.print("Digite o primeiro número: ");
		num1 = in.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = in.nextDouble();
		System.out.println("O resultado é: " + (num1 + num2));
	}

	public static void subtracao() {
		double num1, num2;

		System.out.println("--- Subtração ---");
		System.out.print("Digite o primeiro número: ");
		num1 = in.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = in.nextDouble();
		System.out.println("O resultado é: " + (num1 - num2));
	}

	public static void multiplicacao() {
		double num1, num2;

		System.out.println("--- Multiplicação ---");
		System.out.print("Digite o primeiro número: ");
		num1 = in.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = in.nextDouble();
		System.out.println("O resultado é: " + (num1 * num2));
	}

	public static void divisao() {
		double num1, num2;

		System.out.println("--- Divisão ---");
		System.out.print("Digite o primeiro número: ");
		num1 = in.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = in.nextDouble();
		System.out.println("O resultado é: " + (num1 / num2));

	}

}
