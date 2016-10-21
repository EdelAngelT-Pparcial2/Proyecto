/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema18;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,min;
        a=solicitarNumero(" primer numero");
        b=solicitarNumero(" segundo numero");
        c=solicitarNumero(" tercer numero");
        min=minimo(a,b,c);
        muestra(min);
                
    }
    public static int solicitarNumero(String numero){
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca" + numero);
        n= teclado.nextInt();
        return n;
        
        
    }
    public static int minimo(int a,int b,int c){
        int d,i;
        d=a;
        if(d<b)d=b;
        if(d<c)d=c;
        for(i=2;i<d;i++){
            if(a%i==0 || b%i==0 || c%i==0){
              d=d*i;
              if(a%i==0)a=a/i;
              if(b%i==0)b=b/i;
              if(c%i==0)c=c/i;
            }
        }
        return d;
    }
    public static void muestra(int minimo){
        System.out.println("El minimo comun multiplo es; " + minimo);
    }
}
