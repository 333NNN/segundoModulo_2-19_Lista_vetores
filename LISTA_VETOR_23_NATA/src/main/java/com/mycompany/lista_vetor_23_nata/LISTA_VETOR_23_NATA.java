/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_23_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_23_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String[][] matriz = new String[3][2];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º estado: ");
            matriz[i][0] = read.nextLine();

            System.out.println("Digite a capital do " + (i + 1) + "º estado: ");
            matriz[i][1] = read.nextLine();
        }

        System.out.println("\nEstados e suas capitais:");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][0] + " -> " + matriz[i][1]);
        }
    }
}
