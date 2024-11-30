/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_vetor_24_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_24_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor do Kw em reais: ");
        float valorKw = Float.parseFloat(read.nextLine());

        int maxConsumidores = 100;
        String[] nomes = new String[maxConsumidores];
        float[] consumos = new float[maxConsumidores];
        int count = 0;

        String continuar;
        do {
            if (count >= maxConsumidores) {
                System.out.println("Limite de consumidores atingido!");
                break;
            }

            System.out.print("Digite o nome do consumidor: ");
            nomes[count] = read.nextLine();

            System.out.println("Digite a quantidade de Kw consumida: ");
            consumos[count] = Float.parseFloat(read.nextLine());

            count++;

            System.out.println("Deseja adicionar mais um consumidor? (S/N): ");
            continuar = read.nextLine().toUpperCase();
        } while (continuar.equals("S"));

        System.out.println("\nLista de consumidores e valores a pagar:");
        for (int i = 0; i < count; i++) {
            float totalPagar = valorKw * consumos[i];
            System.out.println("Nome: " + nomes[i] + ", Total a pagar: R$ " + String.format("%.2f", totalPagar));
        }
    }
}
