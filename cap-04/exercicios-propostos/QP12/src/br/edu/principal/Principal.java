package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário bruto: ");
        double salariobruto = sc.nextInt();

        if(salariobruto<=350) {
            double salario_liquido = salariobruto + 100 - (salariobruto*0.07);
            System.out.println("O salário líquido será de " + salario_liquido);
        }
        else if(salariobruto>350 &&  salariobruto<600) {
            double salario_liquido = salariobruto + 75 - (salariobruto*0.07);
            System.out.println("O salário líquido será de " + salario_liquido);
        }
        else if(salariobruto>=600 && salariobruto<=900) {
            double salario_liquido = salariobruto + 50 - (salariobruto*0.07);
            System.out.println("O salário líquido será de " + salario_liquido);
        }
        else {
            double salario_liquido = salariobruto + 35 - (salariobruto*0.07);
            System.out.println("O salário líquido será de " + salario_liquido);
        }
        sc.close();
    }

}

