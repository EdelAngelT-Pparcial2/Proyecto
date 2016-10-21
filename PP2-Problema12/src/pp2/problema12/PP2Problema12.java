/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema12;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int [] media = new int[10];
       media= solicitarNumero(media);
       mostrar(media);
    }
    public static int[] solicitarNumero(int []a){
        int i=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero");//Se solicitan los numeros
        while(i<a.length){
        a[1]= teclado.nextInt();
        i++;
        }
        return a;
        }
    public static void mostrar(int []a){//Se hace la suma de los numeros y se calula la media de todos esos
       int p=0,q=0;
       for(int i=1;i<a.length;i+=2){
           p=a[i]+p;
          q++;
       }
       p=p/q;
       System.out.println("La media de los numeros es:" + p);//Muestra el promedio de los numeros
    }
}
 
