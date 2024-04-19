package fiap;

import java.util.Scanner;

public class Exercicio01 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Informe o tipo de acomodação: ");
		int acomodacao = in.nextInt();
		while(acomodacao != 1 && acomodacao != 2 && acomodacao != 3) {
			System.out.println("Tipo inválido!");
			System.out.print("Informe o tipo de acomodação: ");
			acomodacao = in.nextInt();
		}
		System.out.print("\nInforme a quantidades de diárias: ");
		int qtdDiarias = in.nextInt();
		
		double estadia = calcularEstadia(acomodacao,qtdDiarias);
		pagamento(estadia);

	}

	public static double calcularEstadia(int tipoAcomodacao, int qtdDiarias) {

		if (tipoAcomodacao == 1) {
			return 380 * qtdDiarias;
		} else if (tipoAcomodacao == 2) {
			return 450 * qtdDiarias;
		} else {
			return 450 * qtdDiarias;
		}
	}
	
	public static void pagamento(double estadia) {
		String pagamento="";
		System.out.print("Informe o método de pagamento (V - à vista com 10% de desconto / P - à prazo sem desconto): ");
		pagamento= in.next();
		while(!pagamento.equalsIgnoreCase("P") && !pagamento.equalsIgnoreCase("V")){
			System.out.println("Método inválido!");
			System.out.print("Informe o método de pagamento (V - à vista com 10% de desconto / P - à prazo sem desconto): ");
			pagamento= in.next();
		}
		if (pagamento.equalsIgnoreCase("V")) {
			estadia = estadia*0.9;
		}
		
		System.out.println("Metodo de pagamento - "+ pagamento +" Valor final: R$" + estadia);
	}
}