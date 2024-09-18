/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_12_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_12_NATA {

    public static void main(String[] args) {
         
        int[] vetor = new int[20];
        Scanner read = new Scanner(System.in);
        
        System.out.println("Preencha o vetor com 20 números inteiros: ");
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = read.nextInt();
        }
        
        System.out.println("Vetor na ordem inversa: ");
        for (int j = vetor.length - 1; j >= 0; j--){
            System.out.print(vetor[j] + " ");
        }
    }
}
