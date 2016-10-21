/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema19;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double angulo;
        angulo= solicitarAngulo();
        resultado(angulo);
    }
    public static double solicitarAngulo(){//Se introduce el angulo que usaremos
        double angulo;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce angulo");
        angulo = teclado.nextDouble();
        return angulo;
    }
   public static void resultado(double angulo){//Se calcula cual es el coseno,seno,tangente del angulo
       double a= Math.toRadians(angulo);
       System.out.println(Math.cos(angulo) + " coseno");
       System.out.println(Math.sin(angulo) + " seno");
       System.out.println(Math.tan(angulo) + " tangente");
   }
}
