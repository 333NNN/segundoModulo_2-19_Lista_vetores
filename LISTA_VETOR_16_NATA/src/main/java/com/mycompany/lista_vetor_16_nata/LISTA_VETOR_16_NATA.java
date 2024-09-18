/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_16_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_16_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] v1 = new int[15];
        int[] v2 = new int[15];
        int contadorMesmaPosicao = 0;
        int contadorRepetidos = 0;

        System.out.println("Preencha o vetor V1 com 15 valores:");
        for (int i = 0; i < v1.length; i++) {
            System.out.print((i + 1) + "ª posição de V1: ");
            v1[i] = ler.nextInt();
        }

        System.out.println("\nPreencha o vetor V2 com 15 valores:");
        for (int i = 0; i < v2.length; i++) {
            System.out.print((i + 1) + "ª posição de V2: ");
            v2[i] = ler.nextInt();
        }

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == v2[i]) {
                contadorMesmaPosicao++;
            }
        }

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    contadorRepetidos++;
                    break;
                }
            }
        }

        System.out.println("\nQuantidade de vezes que V1 e V2 possuem os mesmos números nas mesmas posições: " + contadorMesmaPosicao);
        System.out.println("Quantidade de vezes que V1 e V2 possuem os mesmos números (independente da posição): " + contadorRepetidos);
    }
}
