package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco = scanner.nextDouble();
        String tipo = scanner.next().toUpperCase();
        String refri = scanner.next().toUpperCase();

        double valorAd = 0.0;
        switch (refri) {
            case "N" -> {
                switch (tipo) {
                    case "A" -> {
                        if (preco < 15) valorAd = 2;
                        else  valorAd = 5;
                    }
                    case "L" -> {
                        if (preco < 10) valorAd = 1.5;
                        else valorAd = 2.5;
                    }
                    case "V" -> {
                        if (preco < 30) valorAd = 3;
                        else valorAd = 2.5;
                    }
                }
            }
            case "S" -> {
                if (tipo.equals("A")) valorAd = 8;
            }
        }

        double imp = preco < 25 ? preco * 0.05 : preco * 0.08;
        double precoTotal = preco + imp;
        double valDesc = tipo.equals("A") || refri.equals("S") ? 0.0 : precoTotal * 0.03;
        precoTotal = precoTotal + valorAd - valDesc;

        String clsf = "Barato";
        if (precoTotal > 50 && precoTotal < 100) clsf = "Normal";
        else if (precoTotal >= 100) clsf = "Caro";
    }

}
