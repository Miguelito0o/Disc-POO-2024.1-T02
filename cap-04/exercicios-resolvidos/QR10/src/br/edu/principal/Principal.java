package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de duas datas a seguir, na seguinte ordem: dia/mês/ano: ");
		System.out.println("PRIMEIRA DATA - Dia: ");
		int d1 = sc.nextInt();
		System.out.println("PRIMEIRA DATA - Mês: ");
		int m1 = sc.nextInt();
		System.out.println("PRIMEIRA DATA - Ano: ");
		int a1 = sc.nextInt();
		System.out.println("SEGUNDA DATA - Dia: ");
		int d2 = sc.nextInt();
		System.out.println("SEGUNDA DATA - Mês: ");
		int m2 = sc.nextInt();
		System.out.println("SEGUNDA DATA - Ano: ");
		int a2 = sc.nextInt();
		
		if(a1>a2) {
			System.out.println("A maior data cronologicamente é " + d1 + "/" + m1 + "/" + a1);
		}
		else if (a2>a1) {
			System.out.println("A maior data cronologicamente é " + d2 + "/" + m2 + "/" + a2);
		}
		else if(a1==a2) {
			if(m1>m2) {
				System.out.println("A maior data cronologicamente é " + d1 + "/" + m1 + "/" + a1);
			}
			else if (m2>m1){
				System.out.println("A maior data cronologicamente é " + d2 + "/" + m2 + "/" + a2);
			}
			else if(m1==m2) {
				if(d1>d2) {
				System.out.println("A maior data cronologicamente é " + d1 + "/" + m1 + "/" + a1);
			}
				else {
				System.out.println("A maior data cronologicamente é " + d2 + "/" + m2 + "/" + a2);
			}
		 }
			sc.close();	
		}
		

}
}
