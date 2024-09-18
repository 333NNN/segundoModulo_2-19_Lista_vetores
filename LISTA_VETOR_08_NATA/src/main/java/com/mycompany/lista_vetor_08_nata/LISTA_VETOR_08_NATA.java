/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_08_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_08_NATA {

    public static void main(String[] args) {
        
        float[] notas = new float[20];
        float soma = 0;
        float media = 0;
        int acimaMedia = 0;
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < notas.length; i++){
            System.out.println("Preencha as notas: ");
            notas[i] = read.nextFloat();
            soma += notas[i];
        }
        
        media = soma / notas.length;
        
        for (float nota : notas) {
            if (nota > media) {
                acimaMedia += 1;
            }
        }
        
        System.out.println("A média da turma é "+ media);
        System.out.println("Número de alunos acima da média: "+ acimaMedia);
    }
}
