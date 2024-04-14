package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoE = scanner.nextInt();
        double peso = scanner.nextDouble();
        int codigoC = scanner.nextInt();
        peso *= 1000;

        double precoCarga;
        if (codigoC <= 20) {
            precoCarga = peso * 100;
        } else if (codigoC <= 30) {
            precoCarga = peso * 250;
        } else {
            precoCarga = peso * 340;
        }

        double valorImp = switch (codigoE)  {
            case 1 -> precoCarga * 0.35;
            case 2 -> precoCarga * 0.25;
            case 3 -> precoCarga * 0.15;
            case 4 -> precoCarga * 0.05;
            default -> 0.0;
        };

        double valorTotal = precoCarga + valorImp;
        System.out.println(peso);
        System.out.println(precoCarga);
        System.out.println(valorImp);
        System.out.println(valorTotal);
    }

}
