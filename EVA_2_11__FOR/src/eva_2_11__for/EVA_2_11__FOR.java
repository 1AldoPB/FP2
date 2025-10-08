/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_11__for;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA_2_11__FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ini,fin,resi;
        System.out.println("Inicio");
        ini = sc.nextInt();
        System.out.println("FIN");
        fin=sc.nextInt();
        for(int i =ini;i<=fin;i++){
            resi=i % 2;//saber si es par
            if(resi==0)//es par
         System.out.print(i+"-");
        
        
        
        }
    }
    
}
