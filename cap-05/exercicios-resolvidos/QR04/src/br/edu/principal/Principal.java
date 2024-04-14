package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma_vei = 0;
		int soma_acid = 0;
		int cont_acid = 0;
		int cont = 1;
		int cod;
		int num_vei;
		int num_acid;
		int cid_maior;
		int cid_menor;
		int média_vei;
		int maior;
		int menor;
		
		while(cont<=5) {
			if(cont==1) {
				System.out.println("Digite o código da cidade, o número de veículos e o número de acidentes, respectivamente: ");
				cod = sc.nextInt();
				num_vei = sc.nextInt();
				num_acid = sc.nextInt();
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
			}
			else {
				System.out.println("Digite o código da cidade, o número de veículos e o número de acidentes, respectivamente: ");
				cod = sc.nextInt();
				num_vei = sc.nextInt();
				num_acid = sc.nextInt();
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
				if(num_acid>maior) {
					maior = num_acid;
					cid_maior= cod;
					
				}
				else {
					menor = num_acid;
					cid_menor = cod;
				}
			}
			soma_vei = soma_vei+num_vei;
			if(num_vei<2000) {
				soma_acid = soma_acid+num_acid;
				cont_acid=cont_acid+1;
			}
			System.out.println(maior+"--"+cid_maior);
			System.out.println(menor+"--"+cid_menor);
			média_vei=soma_vei/5;
			System.out.println(média_vei);

		}
		sc.close();

	}

}
