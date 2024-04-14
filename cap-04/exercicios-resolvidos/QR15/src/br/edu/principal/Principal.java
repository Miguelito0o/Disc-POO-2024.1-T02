package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite abaixo -> ");
		System.out.println("O valor do salário mínimo:");
		double salário_min = sc.nextInt();
		System.out.println("Número de horas trabalhadas:");
		double horas = sc.nextInt();
		System.out.println("Número de dependentes do funcionário:");
		double dependentes = sc.nextInt();
		System.out.println("Número de horas extras trabalhadas:");
		double horas_extra = sc.nextInt();
		
		double salário_bruto = (0.2*salário_min)*horas + dependentes*32 + horas_extra*((0.2*salário_min)+(0.5*(0.2*salário_min)));
		
		if(salário_bruto<200) {
			double salário_líquido = salário_bruto;
			if(salário_líquido<=350) {
				System.out.println("O salário definitivo é de" + salário_líquido+100);
			}
			else {
				System.out.println("O salário definitivo é de" + salário_líquido+50);
			}
		}
		else if(salário_bruto>=200 && salário_bruto<=500) {
			double salário_líquido = salário_bruto - (0.1*salário_bruto);
			if(salário_líquido<=350) {
				System.out.println("O salário definitivo é de" + salário_líquido+100);
			}
			else {
				System.out.println("O salário definitivo é de" + salário_líquido+50);
			}
		}
		else {
			double salário_líquido = salário_bruto - (0.2*salário_bruto);
			if(salário_líquido<=350) {
				System.out.println("O salário definitivo é de" + salário_líquido+100);
			}
			else {
				System.out.println("O salário definitivo é de" + salário_líquido+50);
			}
		}
		sc.close();
	}

}
