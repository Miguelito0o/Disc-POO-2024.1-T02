package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int cont =1;
		int código;
		int horas_trabalhadas = 0;
		double salário_min;
		double salário_inicial;
		double auxílio;
		double salário_final;
		String turno;
		String categoria;
		
		salário_min = 450;
		while(cont<=10) {
			System.out.println("Digite respectivamente o seu código, o número de horas trabalhadas, seu turno e sua categoria: ");
			código = sc.nextInt();
			horas_trabalhadas = sc.nextInt();
			turno = sc.next();
			categoria = sc.next();
			if(turno!="M" && turno!="V" && turno!="N") {
			System.out.println("Digite seu turno: ");
			turno = sc.next();}
			if(categoria!="G" && categoria!="O") {
				System.out.println("Digite sua categoria: ");
				categoria =sc.next();
			}
			if(categoria=="G") {
				if(turno=="N") {
					salário_min = salário_min*0.18;
				}
				else {
					salário_min = salário_min*0.15;
				}
				if(turno=="N") {
					salário_min = 0.13*salário_min;
				}
				else{
					salário_min = salário_min*0.10;
				}
			  }	
		salário_inicial = horas_trabalhadas*salário_min;
		if(salário_inicial<=300) {
			auxílio = salário_inicial*0.2;
		}
		else if(salário_inicial<600){
			auxílio = salário_inicial*0.15;
		}
		else {
			auxílio = salário_inicial*0.05;
		}
		salário_final = salário_inicial+auxílio;
		System.out.println(código);
		System.out.println(horas_trabalhadas);
		System.out.println(salário_inicial);
		System.out.println(auxílio);
		System.out.println(salário_final);
		}
		sc.close();
	}
		
	}


