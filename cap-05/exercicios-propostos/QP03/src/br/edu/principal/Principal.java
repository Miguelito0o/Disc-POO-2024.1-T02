package br.edu.principal;

import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] faixasEtarias = new int[5];
    int totalPessoas = 0;
    for (int i = 0; i < 8; i++) {
        System.out.print("Digite a idade da pessoa " + (i + 1)
                + ": ");
        int idade = scanner.nextInt();
        totalPessoas++;
        if (idade <= 15) {
            faixasEtarias[0]++;
        } else if (idade <= 30) {
            faixasEtarias[1]++;
        } else if (idade <= 45) {
            faixasEtarias[2]++;
        } else if (idade <= 60) {
            faixasEtarias[3]++;
        } else {
            faixasEtarias[4]++;
        }
    }
    System.out.println("\nQuantidade de pessoas em cada faixa etária:");
    System.out.println("1ª Faixa (até 15 anos): " +
            faixasEtarias[0]);
    System.out.println("2ª Faixa (16 a 30 anos): " +
            faixasEtarias[1]);
    System.out.println("3ª Faixa (31 a 45 anos): " +
            faixasEtarias[2]);
    System.out.println("4ª Faixa (46 a 60 anos): " +
            faixasEtarias[3]);
    System.out.println("5ª Faixa (acima de 60 anos): " +
            faixasEtarias[4]);
    double porcentagemPrimeiraFaixa = (double)
            faixasEtarias[0] / totalPessoas * 100;
    double porcentagemUltimaFaixa = (double) faixasEtarias[4]
            / totalPessoas * 100;
    System.out.println("\nPorcentagem de pessoas na primeira faixa etária em relação ao total de pessoas: " +
    porcentagemPrimeiraFaixa + "%");
    System.out.println("Porcentagem de pessoas na última faixa etária em relação ao total de pessoas: " + porcentagemUltimaFaixa + "%");
    scanner.close();
}
}

