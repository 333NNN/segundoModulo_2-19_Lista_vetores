/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_05_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_05_NATA {

    public static void main(String[] args) {
        int[] v = new int[10];
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i<10; i++){
            System.out.println("Digite o "+ (i+1) +"º valor para preencher o vetor: ");
            v[i] = read.nextInt();
        }
        
        System.out.println("Valores do vetor pela metade: ");
        for (int j = 0; j<10; j++){
            System.out.print(v[j]/2+" ");
        }
    }
}
