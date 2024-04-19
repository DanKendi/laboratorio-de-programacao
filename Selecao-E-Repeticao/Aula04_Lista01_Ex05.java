package fiap;

import java.util.Scanner;

public class Aula04_Lista01_Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner (System.in);
		
		int num=0,min=0,max=0;
		
		for (int i=1;i<10;i++) {
			num = e.nextInt();
			if (i == 1) {
				min = num;
			}
			if (num>max) {
				max = num;
			}
			if (num<min) {
				min = num;
			}
			
		}
		System.out.println("Maior número: "+max);
		System.out.println("Menor número: "+min);
	}

}
