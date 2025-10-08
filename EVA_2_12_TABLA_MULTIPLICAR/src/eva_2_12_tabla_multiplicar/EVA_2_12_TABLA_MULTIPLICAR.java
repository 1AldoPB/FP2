/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_12_tabla_multiplicar;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA_2_12_TABLA_MULTIPLICAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int usu;
       Scanner sc=new Scanner(System.in);
       System.out.println("INGRESE UN NUMERO PARA TABLA DE MULTIPLICAR");
       usu=sc.nextInt();
       for(int i=1;i<=10;i++){
           System.out.println(usu + " x " + i + " = " + (usu * i));
       }
    }
    
}
