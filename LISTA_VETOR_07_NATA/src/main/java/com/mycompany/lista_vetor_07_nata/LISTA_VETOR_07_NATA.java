/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_07_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_07_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String[] nomes = new String[10];
        
        for (int i = 0; i<=9; i++){
            System.out.println("Digite um nome para preencher o vetor: ");
            nomes[i] = ler.nextLine();
        }
        
        System.out.println("Digite o nome que deseja buscar:");
        String buscaNome = ler.nextLine();
        
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (buscaNome.equalsIgnoreCase(nomes[i])) {
                System.out.println("Achei " + nomes[i] + " na posição " + i + "!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Não achei o nome " + buscaNome + " no vetor.");
        }
    }
}
