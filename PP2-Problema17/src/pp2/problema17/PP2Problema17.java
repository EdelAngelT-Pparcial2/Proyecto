/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema17;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        int c;
        a= solicitarA();
        b= solicitarB();
        c= mcd(a,b);
        mostrarMCD(a,b,c);
        
    }
    public static int solicitarA(){//Se ingresa el primer numero
        int a;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce primer numero");
        a= teclado.nextInt();
        return a;
        
    }
    public static int solicitarB(){//Se ingresa el segundo numero
        int b;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce primer numero");
        b= teclado.nextInt();
        return b;
    }
    public static int mcd(int a, int b){ //Se calcula cual es el maximo comun divisor de los 2 numeros
        int c=0;
        for(int i=1;i<=a;i++){
            if(a%i == 0&&b%i == 0)
                c = i;
            }
        return c;
        }
    public static void mostrarMCD(int a,int b,int c){//Se muestra el resultado
        System.out.println("El maximo comun divisor es " + c);
    }
}
        
    
       
      

    


