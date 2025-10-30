/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_busqueda;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA2_23_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int valor,posi =-1;// significa que no lo encontramos el -1
        int datos[]=new int [10];
        for (int i = 0; i < datos.length; i++) {
      datos[i] =(int)(Math.random()*100);
            
        }
        for (int i=0; i<datos.length;i++){
            System.out.print("[" + datos[i] + "]");
        
        }
        System.out.println("");
        System.out.println("Valor a buscar");
        valor =sc.nextInt();
        //Busqueda lineal
          for (int i = 0; i < datos.length; i++) {
         if (valor ==datos[i]){//lo encontramos
         posi=i;//regresamos donde lo encontramos
         break;//ya lo encontre,detengo la busqueda
         
         
         } 
          
          }
          System.out.println("posicion:" + posi);
    }
    
}
