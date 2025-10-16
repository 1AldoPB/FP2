/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA2_14_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tama;
        System.out.println("Cuantas calificaciones necesitas");
        tama=sc.nextInt();
        int califas[]=new int[tama];
        //capturar
        for(int i=0;i<califas.length;i++){
            System.out.println("calificacion"+ (i +1) + ":");
        califas[i]=sc.nextInt();
        //leer
        }for(int i=0;i<califas.length;i++){
            System.out.println("[" + califas[i]+"]");
         
        }
        int suma =0;
        for(int i=0;i<califas.length;i++){
        suma= suma + califas[i];
        //suma += califas[i]
        }
        double promedio =suma / (double )tama;//dividiendo enteros
            System.out.println("promedio ="+ promedio);
        
        
        
        
    
    }
}
