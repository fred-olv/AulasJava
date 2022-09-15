/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.time.LocalDate;

/**
 *
 * @author Frederico Oliveira
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate current_date = LocalDate.now();
           
        int current_Year = current_date.getYear();
        System.out.println("Current year: "+current_Year);
    }
    
}
