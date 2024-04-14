package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int cont =3;
		int num1;
		int num2;
		int res;
		num1 = 0;
		num2 = 1;
		System.out.println(num1 + "---" + num2);
		
		while(cont<=8) {
			res = num1+num2;
			System.out.println(res);
			num1 = num2;
			num2 = res;
			cont++;
		}
	}

}
