package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite a quantidade de termos: ");
		int termos = sc.nextInt();
		System.out.println("Digite um valor positivo para X: ");
		int x = sc.nextInt();
		int fat = 1;
		int j =1;
		int s = 0;
		int expoente = 2;
		int den;
		int denominador =1;
		int i =1;
		int fim;
		
		while(i<=termos) {
			fim = denominador;
			fat = 1;
			while(j<=fim) {
				fat = fat*j;
				j++;
			}
			expoente = i+1;
			if(expoente%2==0) {
				s = s-(x^expoente)/fat;
			}
			else {
				s = s+(x^expoente)/fat;
			}
			if(denominador==4) {
				den = denominador-1;
				if(den==1) {
					denominador = denominador+1;
				}
				else {
					denominador = denominador-1;
				}
			}
			else if (denominador==1) {
				den = 1;
				if(den==1) {
					denominador = denominador+1;
				}
				else {
					denominador = denominador-1;
				}
			}
			i++;
		}
		System.out.println(s);
sc.close();
	}
}
