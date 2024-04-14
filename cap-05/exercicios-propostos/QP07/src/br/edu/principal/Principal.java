package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd50 = 0;
        int qtdIdade = 0; // <= 10 x <= 20
        double mediaAltura = 0;
        double porcent40 = 0; // aferida sobre as 5 pessoas

        for (int i = 1; i<= 5; i++) {
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            double peso = sc.nextDouble();

            if (idade > 50) {
                qtd50++;
            } else if (10 <= idade && idade <= 20) {
                qtdIdade++;
                mediaAltura += altura;
            }
            if (peso < 40) porcent40 += peso;
        }
        porcent40 /= 5 * 100;
        mediaAltura /= qtdIdade;

        System.out.println(qtd50);
        System.out.println(mediaAltura);
        System.out.println(porcent40);
    }

}
