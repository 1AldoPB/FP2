/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arreglos_string2;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA2_6_ARREGLOS_STRING2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        Scanner sc=new Scanner(System.in);
    String diassemana[]= {"DOMINGO","LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO"};
    System.out.println("Introduce el dia en numero (0-6):");
            dia=sc.nextInt();
            System.out.println("El dia es " + diassemana[dia]);
    
    
    }
    
}
