package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qtdC = sc.nextInt();
        int totM = 0;
        int totF = 0;
        double porcentFMortas;
        double porcentMMortos;
        double porcent24 = 0;


        for (int i = 1; i <= qtdC; i++) {
            String sexo = sc.next().toUpperCase();
            int tempoVidaMeses = sc.nextInt();

            switch (sexo) {
                case "M" -> totM++;
                case "F" -> totF++;
            }

            if (tempoVidaMeses <= 24) {
                porcent24++;
            }
        }
        porcentMMortos = totM / qtdC * 100;
        porcentFMortas = totF / qtdC * 100;
        porcent24 /= qtdC * 100;

        System.out.println(porcentMMortos);
        System.out.println(porcentFMortas);
        System.out.println(porcent24);
    }

}
