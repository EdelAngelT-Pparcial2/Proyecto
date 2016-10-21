/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema16;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        int c;
        a= solicitarNumero("a");
        b= solicitarNumero("b");
        c=solicitarNumero("c");
        mayor(a,b,c);
        
        }
    public static int solicitarNumero(String dato){//Se ingresan los 3 numeros que usaremos
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa numero " + dato);
        numero= teclado.nextInt();
        return numero;
    } 
    public static void mayor(int a,int b,int c){//Calculamos cual de esos es el mayor
        int m;
        m=a;
        if(m<b)m=b;
        if(m<c)m=c;
        System.out.println("el numero mayor es " + m);
    }
   
}
