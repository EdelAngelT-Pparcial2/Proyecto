/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema6;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hora;
        int sueldo;
        hora = solicitarHora();
        sueldo = solicitarSueldo();
        sueldoTotal(hora,sueldo);
    }
    public static int solicitarHora(){
        int hora;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce hora");
        hora= teclado.nextInt();
        return hora;
        }
    public static int solicitarSueldo(){
        int sueldo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce sueldo");
        sueldo= teclado.nextInt();
        return sueldo;
    }
    public static void sueldoTotal(int hora, int sueldo){
        int resultado = 0;
        if(hora<=40){
            resultado = hora*sueldo;
        }
        if(hora>40 || hora<48){
            resultado = (40*sueldo)+(hora-40)*(sueldo*2);
        }
        if (hora>=48){
            resultado =(40*sueldo)+8*(sueldo*2)+(hora-48)*(sueldo*3);
        }
    System.out.println("El sueldo es de "+ resultado);
    
           
            
        }
        
        
    }

