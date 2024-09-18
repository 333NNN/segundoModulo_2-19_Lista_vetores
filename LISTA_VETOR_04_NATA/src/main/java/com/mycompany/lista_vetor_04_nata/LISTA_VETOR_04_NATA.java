/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_04_nata;

/**
 *
 * @author ncunha
 */
public class LISTA_VETOR_04_NATA {

    public static void main(String[] args) {
        int[] n = new int[21];

        for (int i = 0; i <= n.length; i++) {
            if (i % 2 == 1) {
                n[i] = i * i;
                System.out.print(n[i] + " ");
            }
        }
    }
}
