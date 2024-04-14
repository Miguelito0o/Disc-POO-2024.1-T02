package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double divida = sc.nextDouble();

        double porcentJuros = 0;
        int qtdP = 1;

        System.out.print(divida);
        double valorJuros = Math.round(divida * porcentJuros);
        System.out.print("\t\t\t" + valorJuros);
        System.out.print("\t\t\t" + qtdP);
        System.out.println("\t\t\t" + (divida + valorJuros) / qtdP);

        qtdP = 3;
        for (int i = 2; i <= 5; i++) {
            System.out.print(divida);
            if (i == 2) {
                porcentJuros = 0.1;
            } else if (i > 2) {
                porcentJuros += 0.05;
            }
            valorJuros = Math.round(divida * porcentJuros);
            System.out.print("\t\t\t" + valorJuros);

            System.out.print("\t\t\t" + qtdP);
            System.out.println("\t\t\t" + (divida + valorJuros) / qtdP);
            qtdP += 3;
        }

    }
}
