package Trabalho1Bimestre;

import java.util.Scanner;

public class Exercicio6 {
    
public static void main(String[] args) {

    String usuario = "admin";
        
    Scanner user = new Scanner(System.in);
      
    usuario = user.nextLine();
    
    if (usuario.equals("admin")) {
        System.out.println("Verdadeiro");
        
    }
   
    else {
        System.out.println("Falso");
    }
    
    
   
}

}
