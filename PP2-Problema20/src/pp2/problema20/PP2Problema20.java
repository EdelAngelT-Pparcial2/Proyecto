/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema20;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        a= solicitarNum();
        b= solicitarNum();
        amigos(a,b);
    }
    public static int solicitarNum(){//Se ingresan los 2 numeros
        int n;
         Scanner teclado = new Scanner(System.in);
         System.out.println("Introduce numero");
         n= teclado.nextInt();
         return n;
        
    }
    public static void amigos(int a, int b){//
        int k=1,p=0,q=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                p=i+p;//Se guardaran la suma de los divisores del numero
            }
            
        }
     for(k=1;k<b;k++){//Se analizan todos los divisores posibles
         if(b%k==0){
             q=k+q;
         }
     }
     if(a==q & b==p){//Se muestra si los numeros son amigos o no
         System.out.println("Los numeros " + a + " y " +  b +" son amigos");
     }else{
         System.out.println("Los numero " + a + " y " +b + " no son amigos");
         
     }
    }
}
