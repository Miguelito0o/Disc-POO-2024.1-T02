package br.edu.principal;

import java.util.Scanner;

public class Principal  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();
        double aumento;
        double novoSalario;
        if (salarioAtual <= 300) {
            aumento = salarioAtual * 0.15;
        } else if (salarioAtual <= 600) {
            aumento = salarioAtual * 0.10;
        } else if (salarioAtual <= 900) {
            aumento = salarioAtual * 0.05;
        } else {
            aumento = 0;
        }
        novoSalario = salarioAtual + aumento;
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);
        scanner.close();
    }
}





