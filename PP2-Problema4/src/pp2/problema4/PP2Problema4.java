/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema4;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int celsius;
        int farenheit;
        celsius = solicitarCelsius();
        farenheit = solicitarFarenheit(celsius);
        grados(farenheit,celsius);
        
    }
    public static int solicitarCelsius(){
        int celsius;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Grados celsius");
        celsius = teclado.nextInt();
        return celsius;
    }
    public static int solicitarFarenheit(int celsius){
        int farenheit;
        farenheit= 32+(9*celsius/5);
        return farenheit;
        
        
    }
    public static void grados(int farenheit, int celsius){
        System.out.println(celsius + " grados centigrados son "+ farenheit +" Farenheit");
        
    }
}
