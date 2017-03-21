package Trabalho1Bimestre;

import java.util.Scanner;

public class Exercicio5 {
    
    
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        double notas;
        double result;
        
        notas = nota.nextDouble();
        
       
        if (notas >= 7.0) {
            System.out.println("Aprovado");
        }
        
        else if (notas >= 4.0 && notas < 7.0) {
            System.out.println("Em exame");
            
        }
        
        if (notas < 4.0) {
        System.out.println("Reprovado");

        }
    

    }

}
