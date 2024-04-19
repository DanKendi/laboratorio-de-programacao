package fiap;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula04_Lista01_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner e = new Scanner (System.in);
	DecimalFormat numF = new DecimalFormat("0.00");
	numF.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
	
	int fEt1=0,fEt2=0,fEt3=0,fEt4=0,fEt5=0,idade=0;
	float porcentagem=0;
	
	for (int i=1; i<6;i++) {
	System.out.println(i+" Pessoa:");
	System.out.print("Digite a idade: ");
	idade = e.nextInt();
	
	if (idade <16) {
		fEt1++;
	}
		else if (idade <31) {
		fEt2++;
				}
		else if (idade<46) {
			fEt3++;
		}
		else if (idade < 61) {
			fEt4++;
		}
		else {
			fEt5++;
		}
	}
	porcentagem = (float)fEt1/5*100;
	
	System.out.println("Número de pessoas na 1ª Faixa: "+fEt1);
	System.out.println("Número de pessoas na 1ª Faixa: "+fEt2);
	System.out.println("Número de pessoas na 1ª Faixa: "+fEt3);
	System.out.println("Número de pessoas na 1ª Faixa: "+fEt4);
	System.out.println("Número de pessoas na 1ª Faixa: "+fEt5);
	System.out.println("Porcentagem de pessoas na 1ª Faixa: "+porcentagem+"%");
	System.out.println("Porcentagem de pessoas na 1ª Faixa: "+numF.format(porcentagem).replace(",",".")+"%");
	
	}

}
