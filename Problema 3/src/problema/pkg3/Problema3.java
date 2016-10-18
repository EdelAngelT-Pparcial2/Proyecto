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
        double factorial=1;
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero");
        numero=teclado.nextInt();
        for (int a=numero;a>0;a--){
            factorial= factorial * a;
        }
        System.out.println("El factorial de "+ numero + " es " + factorial);
    }
    
}
