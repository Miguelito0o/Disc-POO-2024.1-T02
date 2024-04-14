package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();

        if (sal <= 300) {
            System.out.println("Novo salário: " + sal * 1.5);
        } else if (sal <= 500) {
            System.out.println("Novo salário: " + sal * 1.4);
        } else if (sal <= 700) {
            System.out.println("Novo salário: " + sal * 1.3);
        } else if (sal <= 800) {
            System.out.println("Novo salário: " + sal * 1.2);
        } else if (sal <= 1000) {
            System.out.println("Novo salário: " + sal * 1.1);
        } else {
            System.out.println("Novo salário: " + sal * 1.05);
        }
    }

}