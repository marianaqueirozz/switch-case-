/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner inUser =new Scanner(System.in);
    System.out.println("Quantas questões você acertou?");
    int resposta = inUser.nextInt();
    
    switch(resposta){
        case 1:
        case 2:
        case 3:
        case 4:
              System.out.println("Você tirou um I");
              break;
              
        case 5:
        case 6:
              System.out.println("Você tirou um R");
              break;
              
        case 7:
        case 8:      
              System.out.println("Você tirou um B");
              break;
        case 9:
        case 10:      
              System.out.println("Você tirou um MB");
              break;
              
        default:
              System.out.println("Valor de entrada inválido");
    }
    
    }
}
