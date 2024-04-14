package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Digite a quantidade de números a serem lidos: ");
		int n = sc.nextInt();
		int fat = 1;
		int i=1;
		int j=1;
		while(i<=n) {
			System.out.println("Digite o número: ");
			int num = sc.nextInt();
			i++;
			while(j<=num) {
				fat = fat*j;
				j++;
			}
			System.out.println("Valor lido: " + num + "\r\nFatorial:" + fat);
		}
		sc.close();
	}

}
