package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ax² + bx + c = 0

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Não existe raiz real");
        } else if (delta == 0) {
            double x = -b / 2 * a;
            System.out.printf("Duas raízes iguais: %.2f", x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / 2 * a;
            double x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.printf("x1: %.2f\n", x1);
            System.out.printf("x2: %.2f\n", x2);
        }
    }

}
