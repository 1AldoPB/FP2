/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA2_19_DO_WHILE {
 final static String USUARIO = "ALDO";
    final static String PWD ="1234";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //1.pedimos datos de acceso
    Scanner sc=new Scanner(System.in);
    String usu,contra;
    //2.VALIDAMOS
    //3.INCORRECTO-----VOLVER A PREGUNTAR
    //4.CORRECTO---------ACCESO AL SISTEMA
    do{
    System.out.println("USUARIO");
    usu=sc.nextLine();
        System.out.println("Contraseña");
        contra=sc.nextLine();
    }while(!(usu.equals(USUARIO) && contra.equals(PWD)));
    if(usu.equals(USUARIO) && contra.equals(PWD))
       System.out.println("ACCESO CONCEDIDO BIENVENIDO AL SISTEMA");

        
            
    
    }
    
}
