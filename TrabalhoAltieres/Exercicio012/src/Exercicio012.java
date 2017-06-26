import java.util.Scanner;
public class Exercicio012 {

	public static void main(String[] args) {
		int tabuada;
	    Scanner num = new Scanner(System.in);
	    tabuada = num.nextInt();
	}
	
	static int imprimir(int n) {
		for(int i = 10; i >= 1; i--) {

			System.out.println(tabuada + i + (tabuada*i));
		}
	}
}
