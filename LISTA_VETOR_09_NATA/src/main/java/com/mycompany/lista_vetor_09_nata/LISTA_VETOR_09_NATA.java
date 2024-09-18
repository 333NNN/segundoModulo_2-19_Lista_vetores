/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_09_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_09_NATA {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[20];
        int maior = 0;
        int posicao = 0;
        
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Preencha o vetor com números inteiros");
            vetor[i] = ler.nextInt();
            if (vetor[i] < 0){
                System.out.println("Não são permitidos números negativos");
                i--;
            }
            if (vetor[i] > maior){
                maior = vetor[i];
                posicao = i;
            }
        }
        
        System.out.println("O maior valor encontrado no vetor é "+ maior +" na posição "+ posicao);
    }
}
