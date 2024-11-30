/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_27_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_27_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] original = new int[1000];
        int[] copia = new int[1000];

        System.out.println("Digite 1000 valores inteiros:");
        for (int i = 0; i < 1000; i++) {
            System.out.println("Valor " + (i + 1) + ": ");
            original[i] = read.nextInt();
        }

        for (int i = 0; i < 1000; i++) {
            copia[i] = original[i];
        }

        System.out.println("\nValores copiados para o array de cópia:");
        for (int i = 0; i < 1000; i++) {
            System.out.print(copia[i] + " ");
        }
    }
}
