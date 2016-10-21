/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema5;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int primo;
        int i;
        primo = solicitarnumero();
        numero(primo);
        
    }
    public static int solicitarnumero(){//Se introduce el numero
        int primo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir numero");
        primo = teclado.nextInt();
        return primo;
    }
    public static void numero(int primo){//Se comprueba el numero
       int i=1;
       while (primo%i==0){
           i++;
       }
       
        if(i==2){
            System.out.println("Numero primo");}//Se muestra si el numero es primo o no
        else{
            System.out.println("Numero no primo");}
        }
    }
