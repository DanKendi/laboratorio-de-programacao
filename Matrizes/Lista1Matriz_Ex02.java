package fiap;

import java.util.Scanner;

public class Lista1Matriz_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double[][] m = new double[2][2];
		double[][] r = new double[2][2];
		double maior =0;
		
		
		for(int i = 0; i<2;i++) {
			for(int j = 0 ; j<2;j++) {
				System.out.print("Informe um número M[" + (i+1)+ ","+(j+1)+"] = ");
				m[i][j]=in.nextDouble();
				if (m[i][j] > maior) {
					maior = m[i][j];
				}
			}
		}
		
		for(int i = 0; i<2;i++) {
			for(int j =0;j<2;j++) {
				r[i][j]= maior*m[i][j];
				System.out.println("Resultado - Matriz R["+(i+1)+","+(j+1)+"] = "+r[i][j]);
			}
		}
	}

}
