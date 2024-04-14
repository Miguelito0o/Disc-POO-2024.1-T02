package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        if ((x < y + z) && (y < x + z) && (z < x + y)) {
            System.out.println(tipoTriangulo(x, y, z));
        } else {
            System.out.println("Com os comprimentos informados não é possível formar um triângulo");
        }

    }

    public static String tipoTriangulo(double x, double y, double z) {
        if (x == y && y == z) {
            return "Equilátero";
        } else if (x != y && y != z) {
            return "Escaleno";
        }
        return "Isósceles";
    }

}
