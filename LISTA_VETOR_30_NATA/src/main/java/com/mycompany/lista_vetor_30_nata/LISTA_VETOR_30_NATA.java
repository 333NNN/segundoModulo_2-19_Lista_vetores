/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_vetor_30_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_VETOR_30_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String[] nomes = new String[100];
        String[] telefones = new String[100];
        String[] emails = new String[100];
        int contador = 0;
        int opcao;

        while (true) {

            System.out.println("Agenda de Contatos:");
            System.out.println("1. Inserir novo contato");
            System.out.println("2. Listar todos contatos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = read.nextInt();
            read.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do contato: ");
                String nome = read.nextLine();
                System.out.println("Digite o telefone do contato: ");
                String telefone = read.nextLine();
                System.out.println("Digite o email do contato: ");
                String email = read.nextLine();

                nomes[contador] = nome;
                telefones[contador] = telefone;
                emails[contador] = email;
                contador++;

                System.out.println("Contato inserido com sucesso!\n");
            } 
            else if (opcao == 2) {

                if (contador == 0) {
                    System.out.println("Nenhum contato cadastrado.\n");
                } 
                else {
                    System.out.println("\nLista de Contatos:");
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Nome: " + nomes[i]);
                        System.out.println("Telefone: " + telefones[i]);
                        System.out.println("Email: " + emails[i]);
                        System.out.println("-------------------------");
                    }
                }
            } 
            else if (opcao == 3) {
                System.out.println("Saindo da agenda...");
                break;
            } 
            else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
