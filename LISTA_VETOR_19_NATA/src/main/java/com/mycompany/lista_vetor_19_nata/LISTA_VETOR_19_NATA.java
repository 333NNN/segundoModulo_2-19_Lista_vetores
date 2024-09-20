/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_19_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_19_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int pessoas = 250;

        String[] nomes = new String[pessoas];
        double[] alturas = new double[pessoas];
        double[] pesos = new double[pessoas];
        char[] sexos = new char[pessoas];
        
        int totalHomens = 0, totalMulheres = 0;
        double somaPesos = 0, alturaMaisAlta = 0;
        String nomeMaisAlto = "";

        for (int i = 0; i < pessoas; i++) {
            System.out.println("Digite as informações da pessoa " + (i + 1) + ":");
            
            System.out.print("Nome: ");
            nomes[i] = ler.nextLine();

            System.out.print("Altura (em metros): ");
            alturas[i] = ler.nextDouble();

            System.out.print("Peso (em kg): ");
            pesos[i] = ler.nextDouble();

            System.out.print("Sexo (F/M): ");
            sexos[i] = ler.next().toUpperCase().charAt(0);
            ler.nextLine();

            if (sexos[i] == 'M') {
                totalHomens++;
            } else if (sexos[i] == 'F') {
                totalMulheres++;
            }

            somaPesos += pesos[i];

            if (alturas[i] > alturaMaisAlta) {
                alturaMaisAlta = alturas[i];
                nomeMaisAlto = nomes[i];
            }
        }

        double mediaPeso = somaPesos / pessoas;

        double percentualHomens = (double) totalHomens / pessoas * 100;
        double percentualMulheres = (double) totalMulheres / pessoas * 100;

        System.out.println("\nListagem de todas as pessoas:");
        for (int i = 0; i < pessoas; i++) {
            System.out.printf("%s - Altura: %.2f m, Peso: %.2f kg, Sexo: %c%n", nomes[i], alturas[i], pesos[i], sexos[i]);
        }

        System.out.println("\nTotal de Homens: " + totalHomens);
        System.out.println("Total de Mulheres: " + totalMulheres);
        System.out.printf("Percentual de Homens: %.2f%%%n", percentualHomens);
        System.out.printf("Percentual de Mulheres: %.2f%%%n", percentualMulheres);

        System.out.printf("\nMédia de Peso das Pessoas: %.2f kg%n", mediaPeso);

        System.out.println("\nA pessoa mais alta é " + nomeMaisAlto + " com " + alturaMaisAlta + " metros.");
    }
}
