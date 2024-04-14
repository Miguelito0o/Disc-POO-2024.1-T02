package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont=1;
		int n1;
		int n2;
		int média;
		int TA=0;
		int TE=0;
		int TR=0;
		int média_classe;
		int total_classe;
		
		total_classe=0;
		
		while(cont<=6) {
			System.out.println("Digite as duas notas: ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			média=(n1+n2)/2;
			System.out.println("Média: "+média);
			if(média<=3) {
				TR = TR+1;
				System.out.println("REPROVADO");
			}
			else if(média>3 && média<7) {
				TE = TE +1;
				System.out.println("EXAME");
			}
			else{
				TA = TA +1;
			}
			total_classe = total_classe+média;
		}
		System.out.println("REPROVADOS: "+TR);
		System.out.println("EXAME: "+TE);
		System.out.println("APROVADOS: "+TA);
		média_classe = total_classe/6;
		System.out.println("Média da classe: "+média_classe);
		
		sc.close();
	}

}
