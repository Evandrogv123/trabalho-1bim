package Trabalho1Bimestre;

import java.util.Scanner;
        
public class Exercicio9 {
    
    public static void main(String[] args) {
                
        System.out.println("Digite o lado 1 do triangulo: ");
                Scanner lado1 = new Scanner (System.in);
        double lado01 = lado1.nextDouble();
                
        System.out.println("Digite o lado 2 do triangulo: ");
                Scanner lado2 = new Scanner (System.in);
         double lado02 = lado2.nextDouble();
         
        System.out.println("Digite o lado 3 do triangulo: ");
                Scanner lado3 = new Scanner (System.in);
         double lado03 = lado3.nextDouble();

         
                if (lado01 == lado02 && lado02 == lado03 && lado03 == lado01) {
                    System.out.println("Triangulo Equilatero");
                }
                
                else if (lado01 == lado02 || lado02 == lado03 || lado03 == lado01) {
                    System.out.println("Triangulo Isosceles");
                }
                
                else if (lado01 != lado02 && lado02 != lado03 && lado03 != lado01) {
                    System.out.println("Triangulo Escaleno");
                }
    }
    
}


