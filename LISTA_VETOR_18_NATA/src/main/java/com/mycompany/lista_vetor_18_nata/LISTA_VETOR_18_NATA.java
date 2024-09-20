/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_vetor_18_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_18_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vet[] = new int[50];
        boolean repet = false;

        System.out.println("Preencha o vetor com 30 números");
        for (int i = 0; i < vet.length; i++) {
            System.out.println((i + 1) + "º número:");
            vet[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] == vet[j]) {
                    if (!repet) {
                        System.out.println("\nNúmeros repetidos encontrados:");
                        repet = true;
                    }
                    System.out.println("Número " + vet[i] + " repetido nas posições " + i + " e " + j);
                }
            }
        }
        if (!repet) {
            System.out.println("\nNão há números repetidos no vetor.");
        }
    }
}
