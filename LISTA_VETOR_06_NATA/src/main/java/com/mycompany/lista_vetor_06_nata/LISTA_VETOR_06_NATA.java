/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_06_nata;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_06_NATA {

    public static void main(String[] args) {
        
        int[] v = {5, 1, 4, 2, 7, 8, 3, 6};
        
        for(int i = 7; i>=4; i--){
            int aux = v[i];
            v[i] = v[8 - i + 1];
            v[8 - i + 1] = aux;
        }
        v[3] = v[1];
        v[v[3]] = v[v[2]];
        
        for (int j = 0; j<=7; j++){
        System.out.print(v[j]+" ");
        }
    }
}
