package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salMin = scanner.nextDouble();
        String turno = scanner.next().toUpperCase();
        String cat = scanner.next().toUpperCase();
        int horasT = scanner.nextInt();

        double cof = switch (turno) {
            case "M" -> salMin * 0.1;
            case "V" -> salMin * 0.15;
            case "N" -> salMin * 0.12;
            default -> throw new RuntimeException();
        };

        double salBrt = horasT * cof;
        double imp = switch (cat) {
            case "O" -> {
                if (salBrt < 300) yield salBrt * 0.03;
                else yield salBrt * 0.05;
            }
            case "G" -> {
                if (salBrt < 400) yield salBrt * 0.04;
                else yield salBrt * 0.06;
            }
            default -> throw new RuntimeException();
        };

        double grat = turno.equals("N") && horasT > 80 ? 50 : 30;
        double auxAl = cat.equals("O") || cof <= 25 ? (salBrt / 3) : (salBrt / 2);
        double salLiq = salBrt - imp + grat + auxAl;

        String classif = "Mal remunerado";
        if (salLiq >= 350 && salLiq < 600) classif = "Normal";
        else if (salLiq > 600) classif = "Bem remunerado";

        System.out.println(cof);
        System.out.println(salBrt);
        System.out.println(imp);
        System.out.println(grat);
        System.out.println(auxAl);
        System.out.println(salLiq);
        System.out.println(classif);

    }

}
