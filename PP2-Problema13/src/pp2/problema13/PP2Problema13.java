/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema13;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int[] calif = new int[30];
     int p;
     calif= solicitarCalif(calif);
     p= calcularPromedio(calif);
     promedios(calif,p);
    }
    public static int[] solicitarCalif(int []a){//Se solicitan los datos para el arreglo
    Scanner teclado = new Scanner(System.in);
    
    for(int i=0;i<a.length;i++){
        System.out.println("Ingresar Calificacion ["+i+"] :");
        a[i] = teclado.nextInt();
        }
    return a;
    }
    public static int calcularPromedio(int []a){//Se calcula el promedio
        int b=0,c=0,p;
        for(int i=0;i<a.length;i++){
            b=a[i] + b;
            c++;
        }
    p=b/c;
    System.out.println("El promedio es de: " + p);
    return p;
    }
    public static void promedios(int []a,int p){//Se calculan los numeros que estan arriba y abajo del promedio obtenido
        int x=0,y=0;
        for(int i=0;i<a.length;i++)
            if(a[i]<p){
                x++;
            }else{
                y++;
            }
        System.out.println("El numero de calificaciones arriba del promedio son: " + x);    
        System.out.println("El numero de calificaciones abajo del promedio son: " + x); 
    }
    }
    

