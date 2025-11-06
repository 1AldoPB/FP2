/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contra_for;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA2_29_CONTRA_FOR {
    final static String USUARIO = "ALDO";
    final static String PWD ="1234";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usu,contra;
        int intemax=4;
        int inte=0;
        boolean acceso =false; 
        Scanner sc=new Scanner(System.in);
        while(inte < intemax && !acceso){
        System.out.println("INTRODUZCA NOMBRE DE USUARIO");
        usu=sc.nextLine();
        System.out.println("INTRODUZCA CONTRASEÑA");
        contra=sc.nextLine();
        if(usu.equals(USUARIO) && contra.equals(PWD)){
            System.out.println("ACCESO CONCEDIDO");
            System.out.println("BIENVENIDO USUARIO");
        acceso=true;
        
        }else{
        inte++;
            System.out.println("ERROR REINTENTE DE NUEVO LE QUEDAN " + inte + " DE " + intemax);
        }
        }
        if(!acceso){
            System.out.println("EXCEDIO EL NUMERO DE INTENTOS CONCTACTE A SU PROOVEDOR");
        
        }
    }    
}
