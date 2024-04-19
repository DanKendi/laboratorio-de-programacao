package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L2_Ex06 {

	static Scanner e = new Scanner(System.in);
	static DecimalFormat decF = new DecimalFormat("#,##0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double vFinal = 0;
		float pe = 0, total = 0;
		String resp = "sim";
		int cont = 0, cp = 0;

		while (resp.equalsIgnoreCase("sim")) {

			cont++;
			System.out.println("Vendas " + cont);

			// itens da venda preço da etiqueta

			total = 0;

			System.out.println("Digite o preço da etiqueta:");
			pe = e.nextFloat();

			while (pe != 0) {

				total += pe;

				System.out.println("Digite o preço da etiqueta:");
				pe = e.nextFloat();
			}

			System.out.println("Valor Total: " + total);

			// pagamento

			System.out.println("1 - A vista, 10% de desconto");
			System.out.println("2 - A vista no cartão 5% de desconto");
			System.out.println("3 - 2 x preço normal sem juros");
			System.out.println("4 - 3 x preço com acréscimo 10%");

			System.out.println("Digite a forma de pagamento: ");
			cp = e.nextInt();

			while (cp < 1 || cp > 4) {
				System.out.println("Digite uma forma de pagamento válida!");
				cp = e.nextInt();
			}

			if (cp == 1) {
				vFinal = total * 0.9;
				System.out.println("Valor Final: R$" + decF.format(vFinal));
			} else if (cp == 2) {
				vFinal = total * 0.95;
				System.out.println("Valor Final: R$" + decF.format(vFinal));
			} else if (cp == 3) {
				vFinal = total / 2;
				System.out.println("Valor Final: 2x R$" + decF.format(vFinal));
			} else {
				vFinal = (total * 1.1) / 3;
				System.out.println("Valor Final: 3x R$" + decF.format(vFinal));
			}

			System.out.println("Deseja Cadastrar Nova Venda? sim/não");
			resp = e.next();
		}

	}

}
