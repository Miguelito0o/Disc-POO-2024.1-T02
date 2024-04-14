package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
// Mostra as tabuadas de 1 a 10
        for (int i = 1; i <= 10; i++) {
            mostrarTabuada(i);
            System.out.println(); // Adiciona uma linha em branco entre as tabuadas
        }
    }
    // Método para mostrar a tabuada de um número específico
    public static void mostrarTabuada(int numero) {
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

