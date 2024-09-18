/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_02_nata;

/**
 *
 * @author ncunha
 */
public class LISTA_VETOR_02_NATA {

    public static void main(String[] args) {
        int[] n = new int[101];

        for (int i = 100; i >= n.length; i--) {
            n[i] = i;
            System.out.print(n[i] + " ");
        }
    }
}
