package fiap;

import java.util.Scanner;

public class Exercicio05 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numeros = NumerosCarregar();

		numeros = Ordenar(numeros);//parâmetro real
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
	
	public static double[] NumerosCarregar() {
		double[] numeros = new double[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			numeros[i] = in.nextDouble();
		}
		
		return numeros;
	}

	public static double[] Ordenar(double[] numeros) {//parâmetro formal
		double aux = 0;
		for (int i = 0; i < 5; i++) {
			// é possível mover com nomes tbm
			// o if sempre irá utilizar o vetor com os números
			for (int j = 0; j < 4; j++) {
				if(numeros[j]>numeros[j+1]) {
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
			}
		}
		return numeros;
	}
	
	

}
