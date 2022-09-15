/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seesenao;

import java.util.Scanner;

/**
 *
 * @author Frederico Oliveira
 */
public class SeESenao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o ano em que vc nasceu: ");
        int n = teclado.nextInt();
        int i = 2022 - n;
        if (i>=18){
            System.out.println("Maior");
        }else{
              System.out.println("menor");
        }
          
        
        
        // TODO code application logic here
    }
    
}
