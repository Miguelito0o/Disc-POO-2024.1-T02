package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int ano = sc.nextInt();
		double salário = 1000;
		double percentual = 0.015;
		double n_salário = salário +(percentual*salário);
		for(int i=2007; i<=ano; i++) {
			percentual = percentual*2;
			n_salário = salário +(percentual*salário);
		}
		System.out.println(n_salário);
		sc.close();
	}

}
