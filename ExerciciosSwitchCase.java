/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosswitchcase; // Define o pacote do programa

import java.util.Scanner; // Importa o Scanner para ler dados digitados pelo usuário

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExerciciosSwitchCase { // Nome da classe do programa

    public static void main(String[] args) { // Método principal onde o programa começa
        Scanner sc = new Scanner(System.in); // Cria o Scanner para receber entrada do usuário

        // Pede para o usuário digitar um número de 1 a 3
        System.out.print("Digite um número de 1 a 3 e eu mostrarei a fruta correspondente: ");
        int numero = sc.nextInt(); // Lê o número digitado pelo usuário

        // Switch para mostrar a fruta correspondente ao número
        switch (numero) {
            case 1: // Se o número for 1
                System.out.println("Maçã"); // Mostra Maçã
                break; // Fecha o case para não executar os outros
            case 2: // Se o número for 2
                System.out.println("Banana"); // Mostra Banana
                break;
            case 3: // Se o número for 3
                System.out.println("Laranja"); // Mostra Laranja
                break;
            default: // Caso o número digitado não seja 1, 2 ou 3
                System.out.println("Fruta inválida"); // Mensagem de erro
        }

        sc.close(); // Fecha o Scanner
    }
}