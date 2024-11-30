/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetores_22_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_22_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int maxProdutos = 100;
        String[] descricoes = new String[maxProdutos];
        float[] valores = new float[maxProdutos];
        int cont = 0;
        String continuar;
        
        do {
            if (cont >= maxProdutos) {
                System.out.println("Limite de produtos atingido!");
                break;
            }

            System.out.println("Digite a descrição do produto: ");
            descricoes[cont] = read.nextLine();

            System.out.println("Digite o valor do produto: ");
            valores[cont] = Float.parseFloat(read.nextLine());

            cont++;

            System.out.println("Deseja adicionar mais um produto? (S/N): ");
            continuar = read.nextLine().toUpperCase();
        } while (continuar.equals("S"));

        float somaValores = 0;
        for (int i = 0; i < cont; i++) {
            somaValores += valores[i];
        }
        float mediaValores = somaValores / cont;

        System.out.println("\nProdutos com valor abaixo da média:");
        for (int i = 0; i < cont; i++) {
            if (valores[i] < mediaValores) {
                System.out.println("Descrição: " + descricoes[i] + ", Valor: " + valores[i]);
            }
        }

        System.out.print("\nDigite uma letra para buscar produtos: ");
        char caractere = read.nextLine().toUpperCase().charAt(0);

        System.out.println("Produtos que começam com a letra '" + caractere + "':");
        for (int i = 0; i < cont; i++) {
            if (descricoes[i].toUpperCase().startsWith(String.valueOf(caractere))) {
                System.out.println("Descrição: " + descricoes[i] + "Preço:"+ valores[i]);
            }
        }
    }
}
