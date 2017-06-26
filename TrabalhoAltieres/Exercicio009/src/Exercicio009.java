
public class Exercicio009 {

	public static void main(String[] args) {
		System.out.println(imprimir (0));
	}
	
	private static int imprimir(int n) {
		for (int i = 99; i >= 0; i--){

			System.out.println(n+ i--);
			}
		return n;
	}
}
