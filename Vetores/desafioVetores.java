package fiap;

import java.util.Scanner;

public class desafioVetores {
		
	public static Scanner in = new Scanner(System.in); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor1 = new int[] {1,3,5,7,9,11,13,15,17,19};
		int[] vetor2 = new int[] {2,4,6,8,10,12,14,16,18,20};
		int[] vetor3 = new int[20];
		
		int j=0;
 		
		for(int i=0; i < vetor3.length; i++) {
			if (i % 2 == 0) {
				vetor3[i] = vetor1[j];
			}else {
				vetor3[i] = vetor2[j];
				j++;
			}
			System.out.print(vetor3[i]+", ");	
		}

	}

}
