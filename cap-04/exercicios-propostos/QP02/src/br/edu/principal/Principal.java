package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;

        if (media < 3) {
            System.out.println("Reprovado");
        } else if (media < 7) {
            System.out.println("Exame");
        } else {
            System.out.println("Aprovado");
        }
    }

}
