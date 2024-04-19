package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista01_Ex11 {

	static Scanner in = new Scanner(System.in);
	static DecimalFormat decF = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int codClient = 0, codDvd = 0, qtdDvd = 0,cont=0;
		float total = 0, maiorV = 0, menorV = 0, subT = 0;
		char typeDvd = 0, verifNDvd = 'S';
		String verifNLocacao = "sim";

		while (verifNLocacao.equalsIgnoreCase("sim")) {
			cont++;
			System.out.println(cont+"º Locação");
			
			System.out.print("Informe o codigo do cliente: ");
			codClient = in.nextInt();
			
			while (verifNDvd == 'S') {
				System.out.println("Código do DVD (1-20): ");
				codDvd = in.nextInt();
				while (codDvd < 1 && codDvd > 21) {
					System.out.println("Digite um código válido! (1-20)");
					codDvd = in.nextInt();
				}
				System.out.println("Tipo do DVD (A- Ação/C- Comédia/D- Drama): ");
				typeDvd = Character.toUpperCase(in.next().charAt(0));
				while (typeDvd != 'A' && typeDvd != 'C' && typeDvd != 'D') {
					System.out.println("Digite um tipo válido! (A- Ação/C- Comédia/D- Drama)");
					typeDvd = Character.toUpperCase(in.next().charAt(0));
				}
				if (codDvd >= 10) {
					switch (typeDvd) {

					case 'A':
						subT += 8;
						break;
					case 'C':
						subT += 12;
						break;
					default:
						subT += 10;
						break;
					}// switch
				} else {
					switch (typeDvd) {

					case 'A':
						subT += 5;
						break;
					case 'C':
						subT += 7;
						break;
					default:
						subT += 9;
						break;
					}// switch
				} // else
				qtdDvd++;
				
				System.out.println("Cadastrar novo DVD? (S-sim N-não)");
				verifNDvd = Character.toUpperCase(in.next().charAt(0));
				while (verifNDvd != 'S' && verifNDvd != 'N') {
					
				}
				
				
			}// while verificação novo DVD

		} // Main While

	}// main

}
