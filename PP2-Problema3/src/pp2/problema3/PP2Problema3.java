
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg3;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numero;
        numero= solicitarNumero();
        factorial(numero);
         }
    public static int solicitarNumero(){
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero");
        numero= teclado.nextInt();
        return numero;
    }
    public static void factorial(int numero){
        int resultado=1;
        for(int i = numero; i>0 ;i--){
            resultado= resultado * i;
        }
        
     System.out.println("El factorial de "+ numero + " es " + resultado);
    }
    
}
