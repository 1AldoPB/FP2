/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_break;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA2_21_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int valor,adivinar;
        adivinar = (int) (Math.random()*5) +1; //entre el 1 y el 5
        while(true){
        System.out.println("ADIVINA EL NUMERO -1 PARA TERMINAR");
        valor =sc.nextInt();
        if(valor== adivinar){
            System.out.println("FELICIDADES, ADIVINASTE");
        break;
        }
        if(valor == -1)
        break;//termina por completo el ciclo
    }
        System.out.println("GRACIAS POR JUGAR");
    }
}
