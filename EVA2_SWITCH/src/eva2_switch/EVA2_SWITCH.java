/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_switch;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       int opc;
       System.out.println("1.consultar saldo");
       System.out.println("2.retirar monto");
       System.out.println("3.depositar monto");
       System.out.println("selecciona una opcion del menu");
       opc= input.nextInt();
       switch(opc){
           case 1:
               System.out.println("Elegiste imprimir saldo");
               break;//rompe o detiene la ijnstruccion
           case 2:
               System.out.println("ELEGISTE RETIRAR SALDO");
               break;//fin del switch
               case 3:
                   System.out.println("Elegiste depositar saldo");
                   break;//nunca retirar break porque salen las 4 opciones
               default://opcional
                   System.out.println("Opcion incorrecta");
                   
       
       }
       
    }
}
