package Trabalho1Bimestre;

import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args) {
        
        String usuario = "admin";
                
        String senha = "admin";
        
        Scanner user = new Scanner (System.in);
        
        usuario = user.nextLine();
        
        Scanner password = new Scanner (System.in);
        
        senha = password.nextLine();
        
        if (usuario.equals("admin") && senha.equals("admin")) {
            System.out.println("Login efetuado com sucesso!");
        }
        
        else {
            System.out.println("Usuario e/ou senha incorretos");
        }
    }
            
}
