package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
// Mostra o menu de opções
            System.out.println("Menu de opções:");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
// Executa a opção escolhida pelo usuário
            switch (opcao) {
                case 1:
                    mediaAritmetica();
                    break;
                case 2:
                    mediaPonderada();
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite novamente.");
            }
        } while (opcao != 3);
    }
    // Método para calcular e mostrar a média aritmética
    public static void mediaAritmetica() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média aritmética é: " + media);
    }
    // Método para calcular e mostrar a média ponderada
    public static void mediaPonderada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();
        double media = (nota1 * peso1 + nota2 * peso2 + nota3 *
                peso3) / (peso1 + peso2 + peso3);
        System.out.println("A média ponderada é: " + media);
    }
}
