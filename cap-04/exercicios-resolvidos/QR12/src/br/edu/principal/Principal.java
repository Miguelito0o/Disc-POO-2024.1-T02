package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do respectivo cargo: ");
		int cargo = sc.nextInt();
		System.out.println("Agora digite o seu salário: ");
		float salário = sc.nextFloat();
		
		switch(cargo){
			case 1: 
				System.out.println("O seu cargo é *Escriturário(a)* e seu novo salário será de " + (0.5*salário + salário));
				break;
			case 2: 
				System.out.println("O seu cargo é *Secretário(a)* e seu novo salário será de " + (0.35*salário + salário));
				break;
			case 3: 
				System.out.println("O seu cargo é *Caixa* e seu novo salário será de " + (0.2*salário + salário));
				break;
			case 4: 
				System.out.println("O seu cargo é *Gerente* e seu novo salário será de " + (0.1*salário + salário));
				break;
			case 5: 
				System.out.println("O seu cargo é *Diretor* e seu novo salário será de " + salário);
				break;
		}
		sc.close();
}
}
