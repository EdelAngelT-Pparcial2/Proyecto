/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema7;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double kilometros;
        double metros;
        kilometros=solicitarKilometros();
        metros= solicitarMetros(kilometros);
        velocidad(metros,kilometros);
        }
    public static double solicitarKilometros(){//Ingresar los kilometros sobre hora
        double kilometros;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce km/h");
        kilometros= teclado.nextInt();
        return kilometros;
    }
    public static double solicitarMetros(double kilometros){//Se hace la conversion de km/h a m/s
        double metros;
        metros= kilometros*1000/3600;
        return metros;
    }
    public static void velocidad(double metros, double kilometros){
        System.out.println(kilometros + " km/h equivalen a " + metros + "m/s");//Se muestra el resultado
    }
    
}
