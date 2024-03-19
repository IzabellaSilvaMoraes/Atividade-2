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
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor da gasolina");
        double gasolina = input.nextDouble();
        
        System.out.println("Informe o valor do etanol");
        double etanol = input.nextDouble();       
        
        double media = gasolina*0.7;
        
        if (media < etanol){
        System.out.println("Abasteça com gasolina");  
        }
        else{System.out.println("Abasteça com etanol");}
    
    }
    
}
