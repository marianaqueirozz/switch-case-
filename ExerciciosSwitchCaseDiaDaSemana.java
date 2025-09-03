/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license  
 */  

package com.mycompany.exerciciosswitchcasediadasemana; // Define o pacote do programa

import java.util.Scanner; // Importa o Scanner para ler dados digitados pelo usuário

/**  
 *  
 * @author FATEC ZONA LESTE  
 */  
public class ExerciciosSwitchCaseDiaDaSemana { // Nome da classe do programa

    public static void main(String[] args) { // Método principal onde o programa começa
        Scanner sc = new Scanner(System.in); // Cria o Scanner para receber entrada do usuário

        // Pede para o usuário digitar um número de 1 a 7
        System.out.print("Digite um número de 1 a 7: ");
        int numero = sc.nextInt(); // Lê o número digitado pelo usuário

        // Switch para mostrar o dia da semana correspondente ao número
        switch (numero) {
            case 1: // Se o número for 1
                System.out.println("Domingo"); // Mostra Domingo
                break; // Fecha o case
            case 2: // Se o número for 2
                System.out.println("Segunda-feira"); // Mostra Segunda-feira
                break;
            case 3: // Se o número for 3
                System.out.println("Terça-feira"); // Mostra Terça-feira
                break;
            case 4: // Se o número for 4
                System.out.println("Quarta-feira"); // Mostra Quarta-feira
                break;
            case 5: // Se o número for 5
                System.out.println("Quinta-feira"); // Mostra Quinta-feira
                break;
            case 6: // Se o número for 6
                System.out.println("Sexta-feira"); // Mostra Sexta-feira
                break;
            case 7: // Se o número for 7
                System.out.println("Sábado"); // Mostra Sábado
                break;
            default: // Caso o número digitado não seja entre 1 e 7
                System.out.println("Dia inválido"); // Mensagem de erro
        }

        sc.close(); // Fecha o Scanner
    }  
}