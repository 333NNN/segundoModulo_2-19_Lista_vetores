/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_17_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_17_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int vetor[] = new int[30];
        int num, contador = 0;
        
        System.out.println("Preencha o vetor com 30 números");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + "º número:");
            vetor[i] = ler.nextInt();
        }
        
        System.out.println("Digite um número qualquer para verificação:");
        num = ler.nextInt();
        
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == num){
                contador++;
            }
        }
        
        System.out.println("O número "+ num +" aparece "+ contador +" no vetor");
    }
}
