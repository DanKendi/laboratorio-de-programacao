package fiap;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		//Chama procedimento Verifica()
		
		verifica();
		
	}//Fecha main

	//Métodos
	// Procedimento não retorna
	public static void verifica(){
		Scanner in = new Scanner(System.in);
		
		int num=0;
		
		System.out.print("Digite um número: ");
		num = in.nextInt();
		
		if (num % 2 == 1) {
			System.out.println("Impar");
		}else {
			System.out.println("Par");
		}
	}
	
	
}
