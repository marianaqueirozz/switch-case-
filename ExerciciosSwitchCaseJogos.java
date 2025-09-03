/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosswitchcasejogos; // Define o pacote do programa

import java.util.Scanner; // Importa o Scanner para ler dados digitados pelo usuário

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExerciciosSwitchCaseJogos { // Nome da classe do programa

    public static void main(String[] args) { // Método principal onde o programa começa
        Scanner sc = new Scanner(System.in); // Cria o Scanner para receber entrada do usuário

        // Pede para o usuário digitar um número de 1 a 5
        System.out.print("Digite um número de 1 a 5: ");
        int numero = sc.nextInt(); // Lê o número digitado pelo usuário

        // Switch para mostrar o jogo correspondente ao número
        switch (numero) {
            case 1: // Se o número for 1
                System.out.println("Minecraft"); // Mostra Minecraft
                break; // Fecha o case
            case 2: // Se o número for 2
                System.out.println("FIFA"); // Mostra FIFA
                break;
            case 3: // Se o número for 3
                System.out.println("Fortnite"); // Mostra Fortnite
                break;
            case 4: // Se o número for 4
                System.out.println("Call of Duty"); // Mostra Call of Duty
                break;
            case 5: // Se o número for 5
                System.out.println("The Sims"); // Mostra The Sims
                break;
            default: // Caso o número digitado não seja entre 1 e 5
                System.out.println("Jogo não encontrado"); // Mensagem de erro
        }

        sc.close(); // Fecha o Scanner
    }
}