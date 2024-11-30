/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_25_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_25_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        System.out.println("Digite o número do mês (1 a 12): ");
        int numeroMes = read.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
            System.out.println("O mês é: " + meses[numeroMes - 1]);
        } else {
            System.out.println("Número inválido! Digite um valor entre 1 e 12.");
        }

    }
}
