/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_vetor_20_nata;

import java.util.Random;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_20_NATA {

    public static void main(String[] args) {
        int[] nums = new int[1000];
        Random aleat = new Random();

        System.out.println("Preencha o vetor com 1000 números:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = aleat.nextInt(1000);
        }

        System.out.println();
        System.out.println("Mostrando todos os números na ordem inversa em que foram digitados:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.printf("%3d ", nums[i]);
            if ((999 - i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Mostrando todos os números ímpares digitados:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                System.out.printf("%3d ", nums[i]);
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println();
        System.out.println("Mostrando todos os números entre 10 e 50 que foram digitados, incluindo 10 e 50:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 10 && nums[i] <= 50) {
                System.out.printf("%3d ", nums[i]);
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
