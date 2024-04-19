package fiap;

import java.util.Scanner;

public class Exercicio04 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static char recebeSx() {
		System.out.print("Informe o sexo do habitante: ");
		char sexo = Character.toUpperCase(in.next().charAt(0));
		while(sexo != 'F' || sexo != 'M') {
			System.out.print("Sexo inválido! \nInforme o sexo do habitante: ");
			sexo = Character.toUpperCase(in.next().charAt(0));
		}
		return sexo;
	}
	
	public static char recebeCorOlhos() {
		System.out.print("Informe a cor dos olhos do habitante (A- azuis ou C - castanhos): ");
		char corOlhos = Character.toUpperCase(in.next().charAt(0));
		while (corOlhos != 'A' || corOlhos != 'C') {
			System.out.println("Cor inválida! \nInforme a cor dos olhos do habitante (A- azuis ou C - castanhos): ");
			corOlhos = Character.toUpperCase(in.next().charAt(0));
		}
		return corOlhos;
	}

	public static char recebeCorCabelos() {
		System.out.println("Informe a cor dos cabelos do habitante (L- louros, P= pretos ou C= castanhos): ");
		char corCabelos = Character.toUpperCase(in.next().charAt(0));
		while(corCabelos != 'L' || corCabelos != 'P' || corCabelos != 'C') {
			
		}
		return corCabelos;
	}
}
