package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = sc.nextDouble();
        int categoria = sc.nextInt();
        String situacao = sc.next().toUpperCase();

        double valor_amt = 0;
        if (preco <= 25) {
            switch (categoria) {
                case 1 -> valor_amt = preco * 0.05;
                case 2 -> valor_amt = preco * 0.08;
                case 3 -> valor_amt = preco * 0.1;
                default -> throw new RuntimeException();
            }
        } else {
            switch (categoria) {
                case 1 -> valor_amt = preco * 0.12;
                case 2 -> valor_amt = preco * 0.15;
                case 3 -> valor_amt = preco * 0.18;
                default -> throw new RuntimeException();
            }
        }

        double valor_imp = (categoria == 2) || (situacao.equals("R")) ? preco * 0.05 : preco * 0.08;
        double novo_preco = preco + valor_amt - valor_imp;

        String classif;
        if (novo_preco <= 50) {
            classif = "Barato";
        } else if (novo_preco < 120) {
            classif = "Normal";
        } else {
            classif = "Caro";
        }

        System.out.println("Preço: " + preco);
        System.out.println("Categoria: " + categoria);
        System.out.println("Situação: " + situacao);
        System.out.println("Valor de aumento: " + valor_amt );
        System.out.println("Valor de imposto: " + valor_imp);

        System.out.println("Novo preço: " + novo_preco);
        System.out.println("Classificação: " + classif);
    }

}
