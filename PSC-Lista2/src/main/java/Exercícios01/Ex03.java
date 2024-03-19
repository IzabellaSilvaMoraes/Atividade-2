/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercícios01;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author 42412814
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Digite o valor do cateto 01 ");
        double cateto01 = input.nextDouble();
        
        System.out.println(" Digite o valor do cateto 02 ");
        double cateto02 = input.nextDouble();
        
        double hipotenusa = Math.hypot(cateto01, cateto02);
        
        System.out.println(" O valor da hipotenusa é: " + hipotenusa );
        
    }
    
}
