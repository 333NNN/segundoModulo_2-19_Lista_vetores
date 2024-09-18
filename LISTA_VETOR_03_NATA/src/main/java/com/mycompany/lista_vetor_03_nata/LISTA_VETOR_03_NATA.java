/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_03_nata;

/**
 *
 * @author ncunha
 */
public class LISTA_VETOR_03_NATA {

    public static void main(String[] args) {
        int[] n = new int[101];

        for (int i = 1; i <= n.length; i++) {
            if (i % 2 == 0) {
                n[i] = i;
                System.out.print(n[i] + " ");
            }

        }
    }
}
