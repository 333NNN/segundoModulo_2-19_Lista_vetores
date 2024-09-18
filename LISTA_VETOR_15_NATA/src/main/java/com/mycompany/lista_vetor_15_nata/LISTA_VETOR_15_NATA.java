/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_vetor_15_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_15_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetor[] = new int[20];
        int vetorNovo[];
        int numero;
        boolean encontrado = false;

        System.out.println("Preencha o vetor com 20 valores inteiros");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + "ª posição:");
            vetor[i] = ler.nextInt();
        }

        System.out.println("Digite um número para buscar no vetor: ");
        numero = ler.nextInt();

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == numero) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            vetorNovo = new int[vetor.length - 1];
            int j = 0;
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] != numero) {
                    vetorNovo[j] = vetor[i];
                    j++;
                }
            }
            System.out.println("Novo vetor sem o número " + numero + ":");
            for (int num : vetorNovo) {
                System.out.print(num + " ");
            }
        } 
        else {
            System.out.println("O número " + numero + " não foi encontrado no vetor.");
        }
    }
}
