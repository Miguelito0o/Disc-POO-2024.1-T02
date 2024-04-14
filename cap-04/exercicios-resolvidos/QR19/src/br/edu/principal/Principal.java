package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura = scanner.nextDouble();
        double peso = scanner.nextDouble();

        if (altura < 1.2) {
            if (peso <= 60) {
                System.out.println("A");
            } else if (peso <= 90) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        } else if (altura <= 1.7) {
            if (peso <= 60) {
                System.out.println("D");
            } else if (peso <= 90) {
                System.out.println("E");
            } else {
                System.out.println("F");
            }
        } else {
            if (peso <= 60) {
                System.out.println("G");
            } else if (peso <= 90) {
                System.out.println("H");
            } else {
                System.out.println("I");
            }
        }
    }

}
