package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista01_Ex08 {

	static Scanner e = new Scanner(System.in);
	static DecimalFormat decF = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float preco=0,perc=0,juros=0;
		
		System.out.println("Digite o preço do carro:");
		preco=e.nextFloat();
		
		System.out.println("O preco final à vista com desconto de 20% é:"+decF.format(preco*0.8));
		for (int i=6;i<=60;i+=6) {
			perc+=0.03;
			juros=1+perc;
		System.out.println("O preco final parcelado em"+i+"X é de R$ "+decF.format(preco*juros)+" com parcelas de R$ "+decF.format(preco*juros/i));	
		}
	}

}
