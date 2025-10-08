/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Numeros del 1-20
        Scanner sc=new Scanner(System.in);
   // Números del 1 al 20
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " -");
        }

        // Imprimir números pares del 0 al 100
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " - ");
        }
        System.out.println(); // salto de línea

        // Imprimir números pares de 100 a 0 (descendente)
        for (int i = 100; i >= 0; i -= 2) {
            System.out.print(i + " - ");
        }
        System.out.println(); 

        // Tabla de multiplicar que el usuario desee
        System.out.println("Imprime la tabla de multiplicar que desee:");
        int usu = sc.nextInt();

        // Imprimir tabla de multiplicar del número ingresado
        for (int i = 1; i <= 10; i++) {
            System.out.println(usu + " x " + i + " = " + (usu * i));
            //2 numeros
        }int ini,fin;
            System.out.println("Inicio");
            ini=sc.nextInt();
            System.out.println("FIN");
            fin=sc.nextInt();
            for(int i=ini;i<=fin;i++)
                System.out.println(i+"-");
            System.out.println("");
            for(int i=fin;i>=ini;i--)
                }
}
   
    

