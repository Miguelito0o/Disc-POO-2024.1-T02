package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal1 = sc.nextDouble();
        double sal2 = sal1 / 3;
        double rend1 = 0;
        double rend2 = 0;
        int qtdMeses = 0;

        do {
            sal1 += sal1 * 0.02;
            sal2 += sal2 * 0.05;
            qtdMeses++;
        } while (sal2 < sal1);

        System.out.println(sal1);
        System.out.println(sal2);
        System.out.println(qtdMeses);
    }

}
