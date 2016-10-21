/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema2;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class PP2Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int metros;
        double pies,yardas,millas;
        metros= solicitarMetros();
        pies= solicitarPies(metros);
        yardas= solicitarYardas(metros);
        millas= solicitarMillas(metros);
        
        
    }
    public static int solicitarMetros(){//Se introducen los metros
        int metros;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cantidad");
        metros= teclado.nextInt();
        return metros;
    }
   public static double solicitarPies(int metros){//Se calculan los pies
       double pies;
       pies = metros * 3.28084;
       System.out.println("El resultado es "+ pies + " pies");
       return pies;
       
   }
   public static double solicitarYardas(int metros){//Se calculan las yardas
       double yardas;
       yardas = metros * 1.09361;
       System.out.println("El resultado es " + yardas + " yardas");
       return yardas;
   }
   public static double solicitarMillas(int metros){//Se calculan las millas
       double millas;
       millas = metros * 0.000621371;
       System.out.println("El resultado es " + millas + " millas");
       return millas;
   }
   
} 
