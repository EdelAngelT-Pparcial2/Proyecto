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
        int num = 0;
        primo = solicitarnumero();
        numero(primo,num);
        
    }
    public static int solicitarnumero(){
        int primo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir numero");
        primo = teclado.nextInt();
        return primo;
    }
    public static void numero(int primo,int num){
       for(int i=1;i>primo+1;i++){
           if(primo % i==0){
               num++;
                }
            }
        if(num!=2){
            System.out.println("Numero es primo");}
        else{
            System.out.println("Numero no es primo");}
        }
    }


