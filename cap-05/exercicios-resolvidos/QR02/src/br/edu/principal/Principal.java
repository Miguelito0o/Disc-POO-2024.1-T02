package br.edu.principal;

import java.util.Scanner;

// E = 1 + 1/1! + 1/2! + 1/3! + ... 1/N!

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        double e = 1;
        double fatorial = 1;

        for (int antecessor = 1; antecessor <= numb; antecessor++) {
            for (int fator = 1; fator <= antecessor; fator++) {
                fatorial *= fator;
            }
            e += 1 / fatorial;
            fatorial = 1;
        }

        System.out.println(e);
    }

}