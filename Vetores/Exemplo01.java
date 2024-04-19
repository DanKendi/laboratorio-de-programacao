package A0502;

import java.util.Scanner;

public class Exemplo01 {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vetorTimes = new String[5];
		
		for (int i=0; i<vetorTimes.length; i++) {
			System.out.println("Digite um time vetor ["+i+"]:");
			vetorTimes[i]=in.next();
			
		}
		for (int i=0;i<5;i++) {
			System.out.println(vetorTimes[i]);
		}
	}

}
