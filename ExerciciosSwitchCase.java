/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosswitchcase;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExerciciosSwitchCase {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 3 e eu mostrarei a fruta correspondente: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Maçã");
                break;
            case 2:
                System.out.println("Banana");
                break;
            case 3:
                System.out.println("Laranja");
                break;
            default:
                System.out.println("Fruta inválida");
        }

        sc.close();
    }
}
