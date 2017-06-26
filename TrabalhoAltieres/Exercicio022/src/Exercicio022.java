import java.util.Scanner;

public class Exercicio022 {
 
	public static void main(String[] args) {
	int valor;
    Scanner numero = new Scanner(System.in);
    valor = numero.nextInt();
    System.out.println(fibonacci(valor));
}

static int fibonacci(int x){
	if (x<2){
		return x;
	}
	else {
		return fibonacci(x-1) + fibonacci(x-2);
	}
}
}