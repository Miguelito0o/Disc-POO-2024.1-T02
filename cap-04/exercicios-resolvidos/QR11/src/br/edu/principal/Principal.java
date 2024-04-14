package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora do início do jogo, em horas e minutos: ");
		System.out.println("HORAS: ");
		int hi = sc.nextInt();
		System.out.println("MINUTOS: ");
		int mi = sc.nextInt();
		
		System.out.println("Digite a hora do término do jogo, em horas e minutos (ps: o jogo não pode durar mais de 24horas): ");
		System.out.println("HORAS: ");
		int hf = sc.nextInt();
		System.out.println("MINUTOS: ");
		int mf = sc.nextInt();

		int ht = hf - hi;
		int mt = mf - mi;
		System.out.println("A duração total do jogo foi de " + ht + " horas e " + mt + " minutos");
		
		sc.close();
	}

}
