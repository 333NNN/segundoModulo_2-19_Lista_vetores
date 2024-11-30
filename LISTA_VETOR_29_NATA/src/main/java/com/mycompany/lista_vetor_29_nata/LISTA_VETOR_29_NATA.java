/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_vetor_29_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_29_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = read.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("\nVetor ordenado em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nDigite um número para inserir no vetor: ");
        int novoNumero = read.nextInt();

        int[] novoVetor = new int[11];
        int i = 0;
        while (i < 10 && numeros[i] < novoNumero) {
            novoVetor[i] = numeros[i];
            i++;
        }
        novoVetor[i] = novoNumero;
        while (i < 10) {
            novoVetor[i + 1] = numeros[i];
            i++;
        }

        System.out.println("\nVetor após inserção do novo número:");
        for (i = 0; i < 11; i++) {
            System.out.print(novoVetor[i] + " ");
        }

    }
}
