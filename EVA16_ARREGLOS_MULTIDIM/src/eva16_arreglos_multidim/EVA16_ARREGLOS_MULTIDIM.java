/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva16_arreglos_multidim;

/**
 *
 * @author aldop
 */
public class EVA16_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz [][]=new int [3][4];
        matriz [0][0]=100;
        matriz [0][1]=200;
        matriz [0][2]=300;
        matriz [0][3]=400;
        //ciclos anidados
        for(int i=0;i< 3;i++){ //filas
            for(int j=0;j<4;j++){ // columnas
               matriz[i][j]=(int)(Math.random() *100);
               
            
            }
        
        
        }  
        for(int i=0;i< 3;i++){ //filas
            for(int j=0;j<4;j++){ // columnas
             System.out.print("[" + matriz[i][j]+ "]");
            }
         System.out.println("");   
        }
    }       
    }