package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço atual do produto: ");
		float preço = sc.nextFloat();
		System.out.println("Digite o valor da venda média mensal: ");
		float venda = sc.nextFloat();
		
		if(preço<30 || venda < 500) {
			double novo_preço = preço + (0.1*preço) - (0*preço);
			System.out.println("O novo valor é de " + novo_preço);
		}
		else if(preço>=30 && preço<80 || venda >= 500 && venda<1200) {
			double novo_preço = preço + (0.15*preço) - (0*preço);
			System.out.println("O novo valor é de " + novo_preço);
		}
		else {
			double novo_preço = preço + (0*preço) - (0.2*preço);
			System.out.println("O novo valor é de " + novo_preço);
		}
		sc.close();
	}

}
