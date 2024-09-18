/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_14_nata;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_14_NATA {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        Random random = new Random();
        double[] temperaturas = new double[365];
        double somaTemperaturas = 0;
        double menorTemp, maiorTemp, mediaAnual;
        int diasAbaixoDaMedia = 0;

        System.out.println("Digite a temperatura média de cada dia do ano:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Dia " + (i + 1) + ":");
            //temperaturas[i] = read.nextDouble();
            temperaturas[i] = 16.0 + (36.0 - 16.0) * random.nextDouble();
            somaTemperaturas += temperaturas[i];
        }

        mediaAnual = somaTemperaturas / temperaturas.length;

        menorTemp = temperaturas[0];
        maiorTemp = temperaturas[0];

        for (double temp : temperaturas) {
            if (temp < menorTemp) {
                menorTemp = temp;
            }
            if (temp > maiorTemp) {
                maiorTemp = temp;
            }
        }

        for (double temp : temperaturas) {
            if (temp < mediaAnual) {
                diasAbaixoDaMedia++;
            }
        }
        
        System.out.printf("Menor temperatura do ano: %.2f°C%n", menorTemp ,"°C");
        System.out.printf("Maior temperatura do ano: %.2f°C%n", maiorTemp ,"°C");
        System.out.printf("Temperatura média anual: %.2f°C%n", mediaAnual ,"°C");
        System.out.printf("Número de dias com temperatura abaixo da média anual: "+ diasAbaixoDaMedia);
    }
}
