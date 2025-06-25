package org.example;

import java.util.Scanner;

public class Conversor {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha a conversão:");
            System.out.println("==========================");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.print("Digite a opção (1 ou 2): ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                  System.out.print("Digite a temperatura em Celsius: ");
                  double celsius = scanner.nextDouble();
                  double fahrenheit = (celsius * 9 / 5) + 32;
                  System.out.printf("Temperatura em Fahrenheit: %.2f ", fahrenheit);
            } else if (opcao == 2) {
                  System.out.print("Digite a temperatura em Fahrenheit: ");
                  double fahrenheit = scanner.nextDouble();
                  double celsius = (fahrenheit - 32) * 5 / 9;
                  System.out.printf("Temperatura em Celsius: %.2f" , celsius);
            } else {
                  System.out.println("Opção inválida.");
            }
            scanner.close();
      }
}
