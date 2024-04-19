package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo04Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DecimalFormat decF = new DecimalFormat("0.00");

		int[][] prodQnt = new int[5][2];
		double[][] precoSubtotal = new double[5][2];
		double total = 0;

		for (int j = 0; j < 5; j++) {
			System.out.println("Produto " + (j + 1));
			System.out.print("Digite o código: ");
			prodQnt[j][0] = in.nextInt();
			System.out.print("Digite o preço: ");
			precoSubtotal[j][0] = in.nextDouble();
			System.out.print("Digite a quantiade: ");
			prodQnt[j][1] = in.nextInt();
			precoSubtotal[j][1] = (double) prodQnt[j][1] * precoSubtotal[j][0];
			total += precoSubtotal[j][1];
		}
		System.out.println("----------------------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println("Código: " + prodQnt[i][0] + "\t Preço: R$" + decF.format(precoSubtotal[i][0])
					+ "\t Quantidade: " + prodQnt[i][1] + "\t Subtotal: R$" + decF.format(precoSubtotal[i][1]));
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Total Geral: R$" + decF.format(total));

	}

}
