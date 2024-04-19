package fiap;

import java.util.Scanner;

public class Aula04_Lista01_Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		float pe=0,total=0;
		
		System.out.println("Digite o preço da etiqueta:");
		pe = e.nextFloat();
		
		while (pe !=0) {
			total = total+pe;
			System.out.println("Dgiite o preço da etiqueta: ");
			pe=e.nextFloat();
		}
		
		System.out.println("Valor total da compra:"+total);
	}

}
