/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA2_26_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int usu;
int factorial =1;
        System.out.println("INTROUDUCE VALOR");
        usu = sc.nextInt();
  for(int i= 1;i<= usu;i++){
    factorial = factorial * factorial *1;
        System.out.println(factorial);
    }
    }
    
}
