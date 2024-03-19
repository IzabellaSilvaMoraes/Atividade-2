/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercícios01;

import java.util.Scanner;

/**
 *
 * @author 42412814
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe as horas");
        int horas = input.nextInt();
        
        System.out.println("Informe os minutos");
        int minutos = input.nextInt();
        
        int minPassado = (horas*60)+minutos;
        
         System.out.println(" Se pasaram " + minPassado + " minutos desde o início do dia ");
        
        
        
        
        
        
        
        
    }
    
    
}
