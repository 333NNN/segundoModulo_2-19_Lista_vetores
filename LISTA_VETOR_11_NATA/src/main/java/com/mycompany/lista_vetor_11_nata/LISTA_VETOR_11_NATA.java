/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_11_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_11_NATA {

    public static void main(String[] args) {
        
        int x = 0;
        int[] a = new int[10];
        int[] m = new int[10];
        Scanner read = new Scanner(System.in);
        
        System.out.println("Preencha o vetor com 10 números inteiros: ");
        for (int i = 0; i < a.length; i++){
            System.out.println((i+1)+"ª posição:");
            a[i] = read.nextInt();
        }
        
        System.out.println("Digite o valor multiplicador: ");
        x = read.nextInt();
        
        for (int j = 0; j < m.length; j++){
            m[j] = a[j]*x;
        }
        
        System.out.println("\nValores do vetor m (valores do vetor a multiplicados por "+ x +"):");
        
        for (int k : m){
            System.out.print(k +" ");
        }
    }
}
