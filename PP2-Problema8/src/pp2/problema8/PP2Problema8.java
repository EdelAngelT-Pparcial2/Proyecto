/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema8;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c1;
        int c2;
        c1= solicitarCateto1();
        c2= solicitarCateto2();
        hipotenusa(c1,c2);
        
    }
    public static int solicitarCateto1(){//Se ingresa el primer cateto
        int c1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir cateto 1");
        c1= teclado.nextInt();
        return c1;
    }
    public static int solicitarCateto2(){//Se ingresa el primer cateto
        int c2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir cateto 2");
        c2= teclado.nextInt();
        return c2;
    }
    public static void hipotenusa(int c1, int c2){//Se calcula la hipotenusa
        double h;
        h = Math.pow(c1,2)+ Math.pow(c2,2);
        System.out.println("la hipotenusa es de " + h);
    }
}
