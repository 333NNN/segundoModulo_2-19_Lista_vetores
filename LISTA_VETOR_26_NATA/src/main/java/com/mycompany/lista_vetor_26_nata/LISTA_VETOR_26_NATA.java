/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_26_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_26_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] numeros = new int[100];

        System.out.println("Digite 100 números inteiros:");

        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) +"º número: ");
            numeros[i] = read.nextInt();
        }

        System.out.println("Digite o número que deseja buscar: ");
        int numeroBuscado = read.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.println("Número encontrado na posição: " + (i + 1));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }

    }
}
