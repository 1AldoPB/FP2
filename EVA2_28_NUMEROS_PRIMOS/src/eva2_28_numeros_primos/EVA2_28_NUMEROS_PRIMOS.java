/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA2_28_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val;
        boolean esPrimo =true;
        System.out.println("INTRODUCE UN VALOR");
        val=sc.nextInt();
        for(int i=2; i < val;i++){
            //division exacta
            int residuo = val % i;
            if (residuo ==0){ //ya no es primo
                esPrimo= false;
                break;
            
            }
        
        }
        if (esPrimo)
            System.out.println("EL VALOR " + val + " ES PRIMO");
        else
            System.out.println("EL VALOR " + val + " NO ES PRIMO");
    }
    
}
