/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Frederico Oliveira
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int n, s=0;
          int imp = 0;
          int dig =0;
          int par =0;
      do{
          n =Integer.parseInt(JOptionPane.showInputDialog(null, 
                  "<html>Informe um numero: <br><em>(valor 0 interrompe)</em></html>"));
        
        if(n%2==0 && n!=0){
            par++;
        }
        if(n==n){
            dig++;
        }
        if(n%2!=0){
            imp++;
        }
          
          
      s+=n;
      } while (n!=0);
      JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr>"+"<br>Somatorio vale "
      +s+"<html>");
      JOptionPane.showMessageDialog(null," <html>total de pares "+ par+" numeros digitados "+dig+
              " numeros impares "+imp+"</html>");
    }
    
}
