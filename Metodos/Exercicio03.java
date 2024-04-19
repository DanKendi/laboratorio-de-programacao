package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
	
	static Scanner in = new Scanner(System.in);
	static DecimalFormat decF = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nomes = new String[4];
		double[] salarios = new double[4];
		double[] tempoServico = new double[4];
		
		for (int i = 0; i < tempoServico.length; i++) {
			System.out.print("Digite o nome do funcionário: ");
			nomes[i] = in.next();
			System.out.print("Informe o salário: ");
			salarios[i] = in.nextDouble();
			System.out.print("Informe o tempo de serviço: ");
			tempoServico[i] = in.nextDouble();
		}
		String[] verifica = verificaAumento(salarios, tempoServico);
		
		relatorio(nomes, verifica);

	}
	
	public static String[] verificaAumento(double[] salarios, double[] tempoServico) {
		String[] verifica = new String[4];
		
		for (int i = 0; i < verifica.length; i++) {
			if(salarios[i] < 700 || tempoServico[i] > 3) {
				verifica[i] = "Tem direito a aumento.";
			} else {
				verifica[i] = "Não tem direita a aumento";
				}
		}
		return verifica;
	}
	
	public static void relatorio(String[] nomes, String[] verifica) {
		System.out.println("Relatório");
		for (int i = 0; i < verifica.length; i++) {
			System.out.println("Funcionário: "+ nomes[i]+" - "+verifica[i]);
		}
	}
}