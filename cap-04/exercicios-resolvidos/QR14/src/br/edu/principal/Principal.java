package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do seu salário: ");
		float salário = sc.nextFloat();
		
		if(salário<=500) {
			double bonificação = 0.05*salário;
			if(salário <=600) {
				double auxílio = 150;
				System.out.println("O valor do seu novo salário acrescido da bonificação e do auxílio estudantil é: " +(salário+bonificação+auxílio));
			}
			else {
				double auxílio = 100;
				System.out.println("O valor do seu novo salário acrescido da bonificação e do auxílio estudantil é: " +(salário+bonificação+auxílio));
			}

		}
		else if(salário>500 && salário <= 1200) {
			double bonificação = 0.12*salário;
			if(salário <=600) {
				double auxílio = 150;
				System.out.println("O valor do seu novo salário acrescido da bonificação e do auxílio estudantil é: " +(salário+bonificação+auxílio));
			}
			else {
				double auxílio = 100;
				System.out.println("O valor do seu novo salário acrescido da bonificação e do auxílio estudantil é: " +(salário+bonificação+auxílio));
			}

		}
		else {
			double bonificação = 0;
			if(salário <=600) {
				double auxílio = 150;
				System.out.println("O valor do seu novo salário acrescido da bonificação e do auxílio estudantil é: " +(salário+bonificação+auxílio));
			}
			else {
				double auxílio = 100;
				System.out.println("O valor do seu novo salário acrescido da bonificação e do auxílio estudantil é: " +(salário+bonificação+auxílio));
			}

		}
		sc.close();

	}

}
