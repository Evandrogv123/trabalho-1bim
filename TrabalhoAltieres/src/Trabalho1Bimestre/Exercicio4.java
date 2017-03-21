
package Trabalho1Bimestre;

import java.util.Scanner;
        
public class Exercicio4 {
    
    public static void main(String[] args) {
        
         Scanner number = new Scanner(System.in);
         int exp;
         int result= 0;
      
        exp = number.nextInt();
        
         for (Integer i = 1; i <=exp; i++) {
	     double resultado = Math.pow(exp, i);
             System.out.println(resultado);
         }     
    }
        
    }