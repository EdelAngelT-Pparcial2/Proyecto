/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema1;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int anyo;
    anyo = solicitarAnyo();
    anyoBisiesto(anyo);
    }
    public static int solicitarAnyo(){//Se pide el año
        int anyo;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa el año");
        anyo = teclado.nextInt();
        return anyo;
    }
     public static void anyoBisiesto (int anyo){//Se calcula si el año es bisiesto o no
        if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 ==0){
            System.out.println("El año" + anyo + "es bisiesto");}
        else{System.out.println("El año" + anyo + "no es bisiesto");
        }
        }
                
    }

