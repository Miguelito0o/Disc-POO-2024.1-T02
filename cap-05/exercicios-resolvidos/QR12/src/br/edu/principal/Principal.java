package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double folhaPag = 0;
        int totPecas = 0;

        int qtdH = 0;
        int qtdM = 0;
        double mediaPecasH = 0;
        double mediaPecasM = 0;

        double maiorSal = 0;
        int numMaiorSal = 0;

        for (int i = 1; i <= 15; i++) {
            double sal = 1400;
            int num = sc.nextInt();
            int qtdP = sc.nextInt();
            String sexo = sc.next().toUpperCase();

            if (qtdP > 30 && qtdP <= 50) {
                double valorEx = (qtdP - 30) * 0.03 * sal;
                sal += valorEx;
            } else {
                double valorEx = (qtdP - 30) * 0.05 * sal;
                sal += valorEx;
            }
            System.out.printf("Operário %d: R$%.2f%n", num, sal);

            folhaPag += sal;
            totPecas += qtdP;

            switch (sexo) {
                case "H" -> {
                    qtdH++;
                    mediaPecasH += qtdP;
                }
                case "M" -> {
                    qtdM++;
                    mediaPecasM += qtdP;
                }
            }
            if (sal > maiorSal) {
                maiorSal = sal;
                numMaiorSal = num;
            }
        }
        mediaPecasH /= qtdH;
        mediaPecasM /= qtdM;

        System.out.println("\n" + folhaPag);
        System.out.println(totPecas);
        System.out.println(mediaPecasH);
        System.out.println(mediaPecasM);
        System.out.println(numMaiorSal);
    }

}
