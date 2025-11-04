/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_piramide;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA2_25_PIRAMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int usu;
        String valor;
        System.out.println("INTRODUZCA VALOR");
        usu=sc.nextInt();
        valor= "*";
        for(int i = 1; i<=usu ; i--){
        for(int j = 1; j<=i ; j--){
            System.out.print("*");
        }
            System.out.println("");
        }
    }
    }
    

