/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_10_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_10_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[20];
        
        int posicao = 0;
        
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Preencha o vetor com números inteiros");
            vetor[i] = ler.nextInt();
            if (vetor[i] < 0){
                System.out.println("Não são permitidos números negativos");
                i--;
            }
        }
        int menor = vetor[0];
        
        for (int i = 1; i < vetor.length; i++){
            if (vetor[i] < menor){
                menor = vetor[i];
                posicao = i;
            }
        }
        
        System.out.println("O menor valor encontrado no vetor é "+ menor +" na posição "+ posicao);
    }
}
