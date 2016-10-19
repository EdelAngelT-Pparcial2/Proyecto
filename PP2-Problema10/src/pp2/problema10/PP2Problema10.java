/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema10;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        numero = solicitarNum();
        fibonacci(numero);
    }
    public static int solicitarNum(){
        int numero;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce numero");
        numero = teclado.nextInt();
        return numero;
    }
    public static void fibonacci(int numero){
        int a=1,b=1;
        System.out.println("Serie Fobunacci");
        System.out.print(a + " ");
        for(int i=2;i<numero;i++){
            System.out.print(b + " ");
            b= a + b ;
            a= b - a;
        }
        System.out.println("");
        }
        
    }

