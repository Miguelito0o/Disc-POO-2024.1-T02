package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;
        do {
            System.out.print("Digite um número inteiro maior que 1: ");
            numb = sc.nextInt();
        } while (numb <= 1);

        int qtdD = 0;
        for (int i = 1; i <= numb; i++) {
            if (numb % i == 0) qtdD++;
        }

        System.out.println(qtdD == 2 ? "Primo" : "Não primo");
    }

}
