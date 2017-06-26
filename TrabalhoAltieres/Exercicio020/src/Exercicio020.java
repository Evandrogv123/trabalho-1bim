import java.util.Scanner;
public class Exercicio020 {

	public static void main(String[] args) {
        int valor;
        Scanner numero = new Scanner(System.in);
        valor = numero.nextInt();
        System.out.println(fat(valor));
	
	}

		static int fat(int num) {
			if (num==0) {
				return 1;
			}
			else {
				return num * fat(num-1);

			}

		}

	}

