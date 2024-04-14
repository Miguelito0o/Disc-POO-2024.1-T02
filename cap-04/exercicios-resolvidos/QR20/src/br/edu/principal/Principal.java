package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoPd = scanner.nextInt();
        int codigoPais = scanner.nextInt();
        double peso = scanner.nextDouble();
        peso = peso * 1000;
        System.out.println("Peso em gramas: " + peso);

        double precoIni;
        if (codigoPd <= 4) {
            precoIni = peso * 10;
            System.out.println("Preço inicial: " + precoIni);
        } else if (codigoPais <= 7) {
            precoIni = peso * 25;
            System.out.println("Preço inicial: " + precoIni);
        } else {
            precoIni = peso * 30;
            System.out.println("Preço inicial: " + precoIni);
        }

        double imp = switch (codigoPais) {
            case 1 -> 0.0;
            case 2 -> precoIni * 0.15;
            case 3 -> precoIni * 0.25;
            default -> throw new RuntimeException();
        };

        System.out.println("Preço final: " + (precoIni + imp));
    }

}
