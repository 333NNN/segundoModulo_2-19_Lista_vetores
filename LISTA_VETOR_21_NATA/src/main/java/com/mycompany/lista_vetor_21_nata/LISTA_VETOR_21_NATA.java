/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_vetor_21_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_21_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int maxFuncionarios = 100;
        String[] nomes = new String[maxFuncionarios];
        float[] salarios = new float[maxFuncionarios];
        int count = 0;

        String continuar;
        do {
            if (count >= maxFuncionarios) {
                System.out.println("Limite de funcionários atingido!");
                break;
            }

            System.out.println("Digite o nome do funcionário: ");
            nomes[count] = read.nextLine();

            System.out.println("Digite o salário do funcionário: ");
            salarios[count] = Float.parseFloat(read.nextLine());

            count++;

            System.out.println("Deseja adicionar mais um funcionário? (S/N): ");
            continuar = read.nextLine().toUpperCase();
        } while (continuar.equals("S"));

        double somaSalarios = 0;
        for (int i = 0; i < count; i++) {
            somaSalarios += salarios[i];
        }
        double mediaSalarial = somaSalarios / count;

        System.out.println("\nFuncionários com salário acima da média:");
        for (int i = 0; i < count; i++) {

            if (salarios[i] > mediaSalarial) {
                System.out.println("Nome: " + nomes[i] + ", Salário: " + salarios[i]);
            }
        }

        System.out.println("\nFuncionários cujo nome começa com a letra 'A':");
        for (int i = 0; i < count; i++) {
            if (nomes[i].toUpperCase().startsWith("A")) {
                System.out.println("Nome: " + nomes[i]);
            }
        }
    }
}
