package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		int termos;
		int num1 = 2;
		int num2 = 7;
		int num3 = 3;
		termos = sc.nextInt();
		
		System.out.println(num1+"--"+num2+"--"+num3);
		
		i =4;
		while(i!=termos) {
			num1=num1*2;
			System.out.println(num1);
			i=i+1;
			if(i!=termos) {
				num2=num2*3;
				System.out.println(num2);
				i=i+1;
				if(i!=termos) {
					num3=num3*4;
					System.out.println(num3);
					i=i+1;
				}
			}
	
		}
		sc.close();

	}

}
