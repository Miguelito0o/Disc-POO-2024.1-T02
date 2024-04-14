package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salBase = scanner.nextDouble();
        int tempo = scanner.nextInt();

        double imp = 0.0;
        if (salBase >= 200 && salBase <= 450) {
            imp = salBase * 0.03;
        } else if (salBase < 700) {
            imp = salBase * 0.08;
        } else {
            imp = salBase * 0.12;
        }

        double grat;
        if (salBase <= 500) {
            if (tempo <= 3) {
                grat = 20;
            } else {
                grat = 30;
            }
        } else {
            if (tempo <= 3) {
                grat = 23;
            } else if (tempo <= 6){
                grat = 35;
            } else {
                grat = 33;
            }
        }

        double salLiq = salBase - imp + grat;
        char cat = 'A';
        if (salLiq > 350 && salLiq < 600) cat = 'B';
        else if (salLiq > 600) cat = 'C';

        System.out.println(imp);
        System.out.println(grat);
        System.out.println(salLiq);
        System.out.println(cat);
    }

}
