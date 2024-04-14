package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaPesos1 = 0;
        int qtd1 = 0;
        double mediaPesos2 = 0;
        int qtd2 = 0;
        double mediaPesos3 = 0;
        int qtd3 = 0;
        double mediaPesos4 = 0;
        int qtd4 = 0;

        for (int i = 1; i <= 15; i++) {
            int idade = sc.nextInt();
            double peso = sc.nextDouble();

            if (idade <= 10) {
                qtd1++;
                mediaPesos1 += peso;
            } else if (idade <= 20) {
                qtd2++;
                mediaPesos2 += peso;
            } else if (idade <= 30) {
                qtd3++;
                mediaPesos3 += peso;
            } else {
                qtd4++;
                mediaPesos4 += peso;
            }
        }
        mediaPesos1 /= qtd1 * 100;
        mediaPesos2 /= qtd2 * 100;
        mediaPesos3 /= qtd3 * 100;
        mediaPesos4 /= qtd4 * 100;
        System.out.println(mediaPesos1);
        System.out.println(mediaPesos2);
        System.out.println(mediaPesos3);
        System.out.println(mediaPesos4);
    }

}
