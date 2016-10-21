/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema14;
/**
 *
 * @author LuisGuillermo
 */
public class PP2Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Se hace una tabla con un arreglo de 7x7
        // TODO code application logic here
        int [][] tabla = new int [7][7];
        mostrarTabla(tabla);
    }
    public static void mostrarTabla(int [][]a){//Se muestra un numero 1 cuando la coordenada es la misma y un 0 cuando no
        int i,p,q = 0;
        for(i=0;i<7;i++){
            for(p=0;p<7;p++){
                if(i==p){
                    q=1;
                }else{
                    q=0;
                            
                            }
                System.out.print(q + " ");
                }
               System.out.println(); 
            }
        
        }
        
    }
      
