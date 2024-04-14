package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double graus = scanner.nextDouble();
        graus = Math.abs(graus);
        String quadrante = "Sobre um dos eixos";
        int qtdv = (int) graus / 360;

        String sv = "Horário";
        if (graus > 0) sv = "Anti-horário";

        if ((graus > 0 && graus < 90) || (graus < -270 && graus > -360)) quadrante = "1";
        else if ((graus > 90 && graus < 180) || (graus < -180 && graus > -270)) quadrante = "2";
        else if ((graus > 180 && graus < 270) || (graus < -90 && graus > -180)) quadrante = "3";
        else if ((graus > 270 && graus < 360) || (graus < 0 && graus > -90)) quadrante = "4";

        System.out.println(sv);
        System.out.println(qtdv);
        System.out.println(quadrante);
    }

}
