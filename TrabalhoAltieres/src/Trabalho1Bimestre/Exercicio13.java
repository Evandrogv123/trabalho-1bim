package Trabalho1Bimestre;

import java.util.Scanner;

public class Exercicio13 {
    
    public static void main(String[] args) {
       int opcao = 0;
       
		do {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Opção 1");
        System.out.println("2 - Opção 2");
        System.out.println("3 - Opção 3");
        System.out.println("4 - Opção 4");
        System.out.println("5 - Opção 5"); 
        
    Scanner escolha = new Scanner (System.in);
        opcao = escolha.nextInt();
			System.out.print("\n");
			switch (opcao) {
			case 1:
        System.out.println("Opção 1 de 5");
				break;
			case 2:
        System.out.println("Opção 2 de 5");
				break;
                        case 3:
        System.out.println("Opção 3 de 5");
                                break;
                        case 4:
        System.out.println("Opção 4 de 5");
                            break;
			case 5:
        System.out.println("Opção 5 de 5");
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}
}
