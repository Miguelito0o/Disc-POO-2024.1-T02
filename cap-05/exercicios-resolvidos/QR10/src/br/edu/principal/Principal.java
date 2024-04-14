package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd18 = 0;
        double mediaIdade = 0;
        double mediaAltura = 0; // 55
        int qtd80 = 0;
        double porcent80; // porcentagem de jogadores do time com mais de 80kg aferida sobre os 55 jogadores do camp

        for (int i = 1; i <= 11; i++) {
            int idade = sc.nextInt();
            double peso = sc.nextDouble();
            double altura = sc.nextDouble();
            System.out.println();

            if (idade < 18) qtd18++;
            mediaIdade += idade;
            mediaAltura += altura;
            if (peso > 80) qtd80++;
        }

        mediaIdade /= 11;
        mediaAltura /= 55;
        porcent80 = qtd80 / 55D * 100;
        System.out.println(qtd18);
        System.out.println(mediaIdade);
        System.out.println(mediaAltura);
        System.out.println(porcent80);
    }

}
