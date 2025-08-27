/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosswitchcasejogos;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExerciciosSwitchCaseJogos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Minecraft");
                break;
            case 2:
                System.out.println("FIFA");
                break;
            case 3:
                System.out.println("Fortnite");
                break;
            case 4:
                System.out.println("Call of Duty");
                break;
            case 5:
                System.out.println("The Sims");
                break;
            default:
                System.out.println("Jogo não encontrado");
        }

        sc.close();
    }
}

