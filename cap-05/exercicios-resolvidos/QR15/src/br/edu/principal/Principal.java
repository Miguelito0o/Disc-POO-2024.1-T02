package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAdicionais = 0;
        double maiorP = 0;
        double menorP = 0;
        double totalImp = 0;
        int qtdBaratos = 0;
        int qtdNormais = 0;
        int qtdCaros = 0;

        for (int i = 1; i <= 12; i++) {
            double precoUt = sc.nextDouble();
            String refri = sc.next();
            String cat = sc.next();

            double custoEst;
            if (precoUt <= 20) {
                custoEst = switch (cat) {
                    case "A" -> 2;
                    case "L" -> 3;
                    case "V" -> 4;
                    default -> throw new RuntimeException();
                };
            } else if (precoUt <= 50) {
                custoEst = refri.equals("S") ? 6 : 0.0;
            } else {
                if (refri.equals("S")) {
                    custoEst = switch(cat) {
                        case "A" -> 5;
                        case "L" -> 2;
                        case "V" -> 4;
                        default -> throw new RuntimeException();
                    };
                } else {
                    custoEst = switch (cat) {
                        case "A", "V" -> 0.0;
                        case "L" -> 1.0;
                        default -> throw new RuntimeException();
                    };
                }
            }

            double imp = cat.equals("A") || refri.equals("S") ? precoUt * 0.04 : precoUt * 0.02;
            double precoF = precoUt + custoEst + imp;
            String classif;
            if (precoF <= 20) classif = "Barato";
            else if (precoF <= 100) classif = "Normal";
            else classif = "Caro";

            mediaAdicionais += custoEst + imp;
            if (precoF > maiorP) maiorP = precoF;
            if (precoF < menorP) menorP = precoF;
            totalImp += imp;

            switch (classif) {
                case "Barato" -> qtdBaratos++;
                case "Normal" -> qtdNormais++;
                case "Caro" -> qtdCaros++;
                default -> throw new RuntimeException();
            }
        }
        System.out.println(mediaAdicionais / 12);
        System.out.println(maiorP);
        System.out.println(menorP);
        System.out.println(totalImp);
        System.out.println(qtdBaratos);
        System.out.println(qtdNormais);
        System.out.println(qtdCaros);
    }

}
